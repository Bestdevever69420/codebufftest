package com.example.mymod.armor;

import com.example.mymod.MyMod;
import com.example.mymod.tools.ModArmorMaterial2;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxene2Leggings extends ItemArmor {
    public ItemPyroxene2Leggings() {
        super(ModArmorMaterial2.PYROXENE2, 0, EntityEquipmentSlot.LEGS);
        setRegistryName("pyroxene2_leggings");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_leggings");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}