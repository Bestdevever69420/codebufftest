package com.example.mymod.armor;

import com.example.mymod.tools.ModArmorMaterial3;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxene3Boots extends ItemArmor {
    public ItemPyroxene3Boots() {
        super(ModArmorMaterial3.PYROXENE3, 1, EntityEquipmentSlot.FEET);
        setRegistryName("pyroxene3_boots");
        setUnlocalizedName("pyroxene3_boots");
    }
}