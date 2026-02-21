package com.example.mymod.armor;

import com.example.mymod.MyMod;
import com.example.mymod.tools.ModArmorMaterial2;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxene2Chestplate extends ItemArmor {
    public ItemPyroxene2Chestplate() {
        super(ModArmorMaterial2.PYROXENE2, 0, EntityEquipmentSlot.CHEST);
        setRegistryName("pyroxene2_chestplate");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_chestplate");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}