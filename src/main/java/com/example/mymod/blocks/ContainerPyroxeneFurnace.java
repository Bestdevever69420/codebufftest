package com.example.mymod.blocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerPyroxeneFurnace extends Container {

    private final IInventory tileFurnace;
    private int burnTime;
    private int currentBurnTime;
    private int cookTime;
    private int totalCookTime;

    public ContainerPyroxeneFurnace(InventoryPlayer playerInventory, IInventory furnaceInventory) {
        this.tileFurnace = furnaceInventory;

        // Input slot (index 0) at (56, 17)
        this.addSlotToContainer(new Slot(furnaceInventory, 0, 56, 17));
        // Fuel slot (index 1) at (56, 53)
        this.addSlotToContainer(new SlotFurnaceFuel(furnaceInventory, 1, 56, 53));
        // Output slot (index 2) at (116, 35)
        this.addSlotToContainer(new SlotFurnaceOutput(playerInventory.player, furnaceInventory, 2, 116, 35));

        // Player inventory (3 rows of 9 slots each)
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        // Player hotbar (9 slots)
        for (int k = 0; k < 9; ++k) {
            this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
        }
    }

    @Override
    public void addListener(IContainerListener listener) {
        super.addListener(listener);
        listener.sendAllWindowProperties(this, this.tileFurnace);
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < this.listeners.size(); ++i) {
            IContainerListener listener = this.listeners.get(i);

            if (this.burnTime != this.tileFurnace.getField(0)) {
                listener.sendWindowProperty(this, 0, this.tileFurnace.getField(0));
            }

            if (this.currentBurnTime != this.tileFurnace.getField(1)) {
                listener.sendWindowProperty(this, 1, this.tileFurnace.getField(1));
            }

            if (this.cookTime != this.tileFurnace.getField(2)) {
                listener.sendWindowProperty(this, 2, this.tileFurnace.getField(2));
            }

            if (this.totalCookTime != this.tileFurnace.getField(3)) {
                listener.sendWindowProperty(this, 3, this.tileFurnace.getField(3));
            }
        }

        this.burnTime = this.tileFurnace.getField(0);
        this.currentBurnTime = this.tileFurnace.getField(1);
        this.cookTime = this.tileFurnace.getField(2);
        this.totalCookTime = this.tileFurnace.getField(3);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int id, int data) {
        this.tileFurnace.setField(id, data);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return this.tileFurnace.isUsableByPlayer(playerIn);
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index == 2) {
                // Output slot -> player inventory
                if (!this.mergeItemStack(itemstack1, 3, 39, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onSlotChange(itemstack1, itemstack);
            } else if (index != 1 && index != 0) {
                // Player inventory -> furnace slots
                if (!FurnaceRecipes.instance().getSmeltingResult(itemstack1).isEmpty()) {
                    // Has smelting recipe -> input slot
                    if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (TileEntityFurnace.isItemFuel(itemstack1)) {
                    // Is fuel -> fuel slot
                    if (!this.mergeItemStack(itemstack1, 1, 2, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (index >= 3 && index < 30) {
                    // Main inventory -> hotbar
                    if (!this.mergeItemStack(itemstack1, 30, 39, false)) {
                        return ItemStack.EMPTY;
                    }
                } else if (index >= 30 && index < 39) {
                    // Hotbar -> main inventory
                    if (!this.mergeItemStack(itemstack1, 3, 30, false)) {
                        return ItemStack.EMPTY;
                    }
                }
            } else {
                // Furnace slots -> player inventory
                if (!this.mergeItemStack(itemstack1, 3, 39, false)) {
                    return ItemStack.EMPTY;
                }
            }

            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, itemstack1);
        }

        return itemstack;
    }
}
