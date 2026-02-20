package com.example.mymod.armor;

import com.example.mymod.MyMod;
import com.example.mymod.tools.ModArmorMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxeneLeggings extends ItemArmor {
    public ItemPyroxeneLeggings() {
        super(ModArmorMaterial.PYROXENE, 2, EntityEquipmentSlot.LEGS);
        setRegistryName("pyroxene_leggings");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_leggings");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
