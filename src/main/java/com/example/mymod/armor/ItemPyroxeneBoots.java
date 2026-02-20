package com.example.mymod.armor;

import com.example.mymod.MyMod;
import com.example.mymod.tools.ModArmorMaterial;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxeneBoots extends ItemArmor {
    public ItemPyroxeneBoots() {
        super(ModArmorMaterial.PYROXENE, 3, EntityEquipmentSlot.FEET);
        setRegistryName("pyroxene_boots");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_boots");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
