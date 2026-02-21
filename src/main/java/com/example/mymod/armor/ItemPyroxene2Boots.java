package com.example.mymod.armor;

import com.example.mymod.MyMod;
import com.example.mymod.tools.ModArmorMaterial2;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemPyroxene2Boots extends ItemArmor {
    public ItemPyroxene2Boots() {
        super(ModArmorMaterial2.PYROXENE2, 0, EntityEquipmentSlot.FEET);
        setRegistryName("pyroxene2_boots");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_boots");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}