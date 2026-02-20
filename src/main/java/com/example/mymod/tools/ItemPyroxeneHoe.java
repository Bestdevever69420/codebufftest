package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemHoe;

public class ItemPyroxeneHoe extends ItemHoe {
    public ItemPyroxeneHoe() {
        super(ModMaterial.PYROXENE);
        setRegistryName("pyroxene_hoe");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_hoe");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
