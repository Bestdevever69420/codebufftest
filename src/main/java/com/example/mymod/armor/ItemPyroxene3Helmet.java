package com.example.mymod.armor;

import com.example.mymod.tools.ModArmorMaterial3;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxene3Helmet extends ItemArmor {
    public ItemPyroxene3Helmet() {
        super(ModArmorMaterial3.PYROXENE3, 1, EntityEquipmentSlot.HEAD);
        setRegistryName("pyroxene3_helmet");
        setUnlocalizedName("pyroxene3_helmet");
    }
}