package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemSword;

public class ItemPyroxene2Sword extends ItemSword {
    public ItemPyroxene2Sword() {
        super(ModMaterial2.PYROXENE2);
        setRegistryName("pyroxene2_sword");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_sword");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}