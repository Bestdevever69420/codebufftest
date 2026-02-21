package com.example.mymod.armor;

import com.example.mymod.tools.ModArmorMaterial3;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxene3Chestplate extends ItemArmor {
    public ItemPyroxene3Chestplate() {
        super(ModArmorMaterial3.PYROXENE3, 1, EntityEquipmentSlot.CHEST);
        setRegistryName("pyroxene3_chestplate");
        setUnlocalizedName("pyroxene3_chestplate");
    }
}