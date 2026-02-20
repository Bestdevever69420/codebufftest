package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemPickaxe;

public class ItemPyroxenePickaxe extends ItemPickaxe {
    public ItemPyroxenePickaxe() {
        super(ModMaterial.PYROXENE);
        setRegistryName("pyroxene_pickaxe");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_pickaxe");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
