package com.example.mymod.armor;

import com.example.mymod.MyMod;
import com.example.mymod.tools.ModArmorMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxeneHelmet extends ItemArmor {
    public ItemPyroxeneHelmet() {
        super(ModArmorMaterial.PYROXENE, 0, EntityEquipmentSlot.HEAD);
        setRegistryName("pyroxene_helmet");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_helmet");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
