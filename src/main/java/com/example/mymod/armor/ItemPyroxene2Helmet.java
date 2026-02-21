package com.example.mymod.armor;

import com.example.mymod.MyMod;
import com.example.mymod.tools.ModArmorMaterial2;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxene2Helmet extends ItemArmor {
    public ItemPyroxene2Helmet() {
        super(ModArmorMaterial2.PYROXENE2, 0, EntityEquipmentSlot.HEAD);
        setRegistryName("pyroxene2_helmet");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_helmet");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}