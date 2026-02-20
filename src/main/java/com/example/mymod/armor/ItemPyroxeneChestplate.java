package com.example.mymod.armor;

import com.example.mymod.MyMod;
import com.example.mymod.tools.ModArmorMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxeneChestplate extends ItemArmor {
    public ItemPyroxeneChestplate() {
        super(ModArmorMaterial.PYROXENE, 1, EntityEquipmentSlot.CHEST);
        setRegistryName("pyroxene_chestplate");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_chestplate");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
