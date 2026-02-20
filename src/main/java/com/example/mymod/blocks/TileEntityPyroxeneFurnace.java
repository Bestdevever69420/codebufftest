package com.example.mymod.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

public class TileEntityPyroxeneFurnace extends TileEntity implements ITickable, ISidedInventory {

    private static final int[] SLOTS_TOP = new int[]{0};
    private static final int[] SLOTS_BOTTOM = new int[]{2, 1};
    private static final int[] SLOTS_SIDES = new int[]{1};

    private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(3, ItemStack.EMPTY);

    /** The number of ticks that the furnace will keep burning */
    private int burnTime;
    /** The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for */
    private int currentBurnTime;
    /** The number of ticks that the current item has been cooking for */
    private int cookTime;
    /** The number of ticks that the current item needs to cook */
    private int totalCookTime;

    /** Custom cook time: 100 ticks = 2x faster than vanilla's 200 */
    public static final int COOK_TIME = 100;

    private String customName;

    // --- ISidedInventory ---

    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        if (side == EnumFacing.DOWN) {
            return SLOTS_BOTTOM;
        } else if (side == EnumFacing.UP) {
            return SLOTS_TOP;
        } else {
            return SLOTS_SIDES;
        }
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return isItemValidForSlot(index, itemStackIn);
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        if (direction == EnumFacing.DOWN && index == 1) {
            Item item = stack.getItem();
            return item == Items.WATER_BUCKET || item == Items.BUCKET;
        }
        return true;
    }

    // --- IInventory ---

    @Override
    public int getSizeInventory() {
        return this.inventory.size();
    }

    @Override
    public boolean isEmpty() {
        for (ItemStack stack : this.inventory) {
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return this.inventory.get(index);
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return ItemStackHelper.getAndSplit(this.inventory, index, count);
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStackHelper.getAndRemove(this.inventory, index);
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        ItemStack currentStack = this.inventory.get(index);
        boolean flag = !stack.isEmpty() && stack.isItemEqual(currentStack)
                && ItemStack.areItemStackTagsEqual(stack, currentStack);

        this.inventory.set(index, stack);

        if (stack.getCount() > this.getInventoryStackLimit()) {
            stack.setCount(this.getInventoryStackLimit());
        }

        if (index == 0 && !flag) {
            this.totalCookTime = COOK_TIME;
            this.cookTime = 0;
            this.markDirty();
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        if (this.world.getTileEntity(this.pos) != this) {
            return false;
        }
        return player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D,
                (double) this.pos.getZ() + 0.5D) <= 64.0D;
    }

    @Override
    public void openInventory(EntityPlayer player) {
    }

    @Override
    public void closeInventory(EntityPlayer player) {
    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        if (index == 2) {
            return false;
        } else if (index != 1) {
            return true;
        } else {
            return TileEntityFurnace.isItemFuel(stack);
        }
    }

    @Override
    public int getField(int id) {
        switch (id) {
            case 0:
                return this.burnTime;
            case 1:
                return this.currentBurnTime;
            case 2:
                return this.cookTime;
            case 3:
                return this.totalCookTime;
            default:
                return 0;
        }
    }

    @Override
    public void setField(int id, int value) {
        switch (id) {
            case 0:
                this.burnTime = value;
                break;
            case 1:
                this.currentBurnTime = value;
                break;
            case 2:
                this.cookTime = value;
                break;
            case 3:
                this.totalCookTime = value;
                break;
        }
    }

    @Override
    public int getFieldCount() {
        return 4;
    }

    @Override
    public void clear() {
        this.inventory.clear();
    }

    // --- Name ---

    @Override
    public String getName() {
        return this.hasCustomName() ? this.customName : "Pyroxene Furnace";
    }

    @Override
    public boolean hasCustomName() {
        return this.customName != null && !this.customName.isEmpty();
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    @Override
    public ITextComponent getDisplayName() {
        return this.hasCustomName() ? new TextComponentString(this.getName())
                : new TextComponentTranslation(this.getName());
    }

    // --- NBT ---

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.inventory = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(compound, this.inventory);
        this.burnTime = compound.getInteger("BurnTime");
        this.cookTime = compound.getInteger("CookTime");
        this.totalCookTime = compound.getInteger("CookTimeTotal");
        this.currentBurnTime = TileEntityFurnace.getItemBurnTime(this.inventory.get(1));

        if (compound.hasKey("CustomName", 8)) {
            this.customName = compound.getString("CustomName");
        }
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("BurnTime", this.burnTime);
        compound.setInteger("CookTime", this.cookTime);
        compound.setInteger("CookTimeTotal", this.totalCookTime);
        ItemStackHelper.saveAllItems(compound, this.inventory);

        if (this.hasCustomName()) {
            compound.setString("CustomName", this.customName);
        }

        return compound;
    }

    // --- Furnace Logic ---

    public boolean isBurning() {
        return this.burnTime > 0;
    }

    @Override
    public void update() {
        boolean wasBurning = this.isBurning();
        boolean dirty = false;

        if (this.isBurning()) {
            --this.burnTime;
        }

        if (!this.world.isRemote) {
            ItemStack fuel = this.inventory.get(1);

            if (this.isBurning() || !fuel.isEmpty() && !this.inventory.get(0).isEmpty()) {
                if (!this.isBurning() && this.canSmelt()) {
                    this.burnTime = TileEntityFurnace.getItemBurnTime(fuel);
                    this.currentBurnTime = this.burnTime;

                    if (this.isBurning()) {
                        dirty = true;

                        if (!fuel.isEmpty()) {
                            Item item = fuel.getItem();
                            fuel.shrink(1);

                            if (fuel.isEmpty()) {
                                ItemStack containerItem = item.getContainerItem(fuel);
                                this.inventory.set(1, containerItem);
                            }
                        }
                    }
                }

                if (this.isBurning() && this.canSmelt()) {
                    ++this.cookTime;

                    if (this.cookTime == this.totalCookTime) {
                        this.cookTime = 0;
                        this.totalCookTime = COOK_TIME;
                        this.smeltItem();
                        dirty = true;
                    }
                } else {
                    this.cookTime = 0;
                }
            } else if (!this.isBurning() && this.cookTime > 0) {
                this.cookTime = Math.max(this.cookTime - 2, 0);
            }

            if (wasBurning != this.isBurning()) {
                dirty = true;
                BlockPyroxeneFurnace.setState(this.isBurning(), this.world, this.pos);
            }
        }

        if (dirty) {
            this.markDirty();
        }
    }

    private boolean canSmelt() {
        if (this.inventory.get(0).isEmpty()) {
            return false;
        }

        ItemStack result = FurnaceRecipes.instance().getSmeltingResult(this.inventory.get(0));

        if (result.isEmpty()) {
            return false;
        }

        ItemStack output = this.inventory.get(2);

        if (output.isEmpty()) {
            return true;
        }
        if (!output.isItemEqual(result)) {
            return false;
        }

        int resultCount = output.getCount() + result.getCount();
        return resultCount <= getInventoryStackLimit() && resultCount <= output.getMaxStackSize();
    }

    private void smeltItem() {
        if (this.canSmelt()) {
            ItemStack input = this.inventory.get(0);
            ItemStack result = FurnaceRecipes.instance().getSmeltingResult(input);
            ItemStack output = this.inventory.get(2);

            if (output.isEmpty()) {
                this.inventory.set(2, result.copy());
            } else if (output.getItem() == result.getItem()) {
                output.grow(result.getCount());
            }

            input.shrink(1);
        }
    }

    public static int getItemBurnTime(ItemStack stack) {
        return TileEntityFurnace.getItemBurnTime(stack);
    }

    public static boolean isItemFuel(ItemStack stack) {
        return TileEntityFurnace.getItemBurnTime(stack) > 0;
    }
}
