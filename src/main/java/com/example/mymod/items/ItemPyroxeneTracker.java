package com.example.mymod.items;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemPyroxeneTracker extends Item {

    // Durability cost per second while active
    public static final int DURABILITY_COST = 1;
    // Durability: 180 ticks = 3 minutes at 60 ticks/sec
    public static final int MAX_DURABILITY = 180;
    
    public ItemPyroxeneTracker() {
        this.setMaxStackSize(1);
        this.setRegistryName("pyroxene_tracker");
        this.setUnlocalizedName(com.example.mymod.MyMod.MODID + ".pyroxene_tracker");
        this.setMaxDamage(MAX_DURABILITY);
        this.setCreativeTab(com.example.mymod.MyMod.CREATIVE_TAB);
        this.setFull3D();
        this.setNoRepair();
    }

    // Called every tick when in inventory - grants night vision
    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean isHeld) {
        if (stack.isEmpty()) return;
        if (!(entity instanceof EntityPlayer)) return;
        
        EntityPlayer player = (EntityPlayer) entity;
        
        // Apply night vision - always on when item is in inventory
        // Use longer duration so it doesn't flicker
        if (!player.isPotionActive(Potion.getPotionById(16))) { // 16 = night vision
            player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 220, 0, true, true));
        }
        
        // Durability decay on server side - once per second
        if (!world.isRemote && world.getTotalWorldTime() % 20 == 0) {
            int currentDamage = stack.getItemDamage();
            int maxDamage = stack.getMaxDamage();
            
            if (currentDamage >= maxDamage - 1) {
                // Item is about to break - break it now
                player.renderBrokenItemStack(stack);
                stack.setCount(0); // Clear the stack
                player.sendMessage(new TextComponentString("§cYour Pyroxene Ring has faded away!"));
            } else {
                stack.setItemDamage(currentDamage + DURABILITY_COST);
            }
        }
    }

    // Glow effect when item has durability remaining
    @Override
    public boolean hasEffect(ItemStack stack) {
        return !stack.isEmpty() && stack.getItemDamage() < stack.getMaxDamage();
    }
    
    // Show durability bar when used
    @Override
    public boolean showDurabilityBar(ItemStack stack) {
        return !stack.isEmpty();
    }
    
    // Custom rarity - RARE when active, COMMON when broken
    @Override
    public net.minecraft.item.EnumRarity getRarity(ItemStack stack) {
        if (stack.isEmpty()) return net.minecraft.item.EnumRarity.COMMON;
        return stack.getItemDamage() < stack.getMaxDamage() ? 
            net.minecraft.item.EnumRarity.RARE : net.minecraft.item.EnumRarity.COMMON;
    }
    
    // Tooltip explaining the item
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, net.minecraft.client.util.ITooltipFlag flagIn) {
        tooltip.add("§5Grants infinite Night Vision");
        tooltip.add("§7while in your inventory");
        if (stack.getItemDamage() > 0) {
            tooltip.add("§cDurability: " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage());
        } else {
            tooltip.add("§aActive");
        }
    }
}
