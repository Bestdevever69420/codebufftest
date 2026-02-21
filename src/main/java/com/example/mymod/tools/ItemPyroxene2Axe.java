package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemAxe;

public class ItemPyroxene2Axe extends ItemAxe {
    public ItemPyroxene2Axe() {
        super(ModMaterial2.PYROXENE2);
        setRegistryName("pyroxene2_axe");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_axe");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}