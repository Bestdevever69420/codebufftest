package com.example.mymod.items;

import com.example.mymod.MyMod;
import net.minecraft.item.Item;

public class ItemPyroxeneIngot extends Item {
    public ItemPyroxeneIngot() {
        setRegistryName("pyroxene_ingot");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_ingot");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
