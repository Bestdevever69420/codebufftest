package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemHoe;

public class ItemPyroxene2Hoe extends ItemHoe {
    public ItemPyroxene2Hoe() {
        super(ModMaterial2.PYROXENE2);
        setRegistryName("pyroxene2_hoe");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_hoe");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}