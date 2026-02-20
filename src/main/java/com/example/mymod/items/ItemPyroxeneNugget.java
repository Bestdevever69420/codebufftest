package com.example.mymod.items;

import com.example.mymod.MyMod;
import net.minecraft.item.Item;

public class ItemPyroxeneNugget extends Item {
    public ItemPyroxeneNugget() {
        setRegistryName("pyroxene_nugget");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_nugget");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
