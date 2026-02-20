package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemAxe;

public class ItemPyroxeneAxe extends ItemAxe {
    public ItemPyroxeneAxe() {
        super(ModMaterial.PYROXENE, 10.0F, -3.0F);
        setRegistryName("pyroxene_axe");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_axe");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
