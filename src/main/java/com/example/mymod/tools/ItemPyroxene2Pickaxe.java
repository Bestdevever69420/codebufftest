package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemPickaxe;

public class ItemPyroxene2Pickaxe extends ItemPickaxe {
    public ItemPyroxene2Pickaxe() {
        super(ModMaterial2.PYROXENE2);
        setRegistryName("pyroxene2_pickaxe");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_pickaxe");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}