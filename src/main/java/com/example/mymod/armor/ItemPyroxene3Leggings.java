package com.example.mymod.armor;

import com.example.mymod.tools.ModArmorMaterial3;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxene3Leggings extends ItemArmor {
    public ItemPyroxene3Leggings() {
        super(ModArmorMaterial3.PYROXENE3, 1, EntityEquipmentSlot.LEGS);
        setRegistryName("pyroxene3_leggings");
        setUnlocalizedName("pyroxene3_leggings");
    }
}