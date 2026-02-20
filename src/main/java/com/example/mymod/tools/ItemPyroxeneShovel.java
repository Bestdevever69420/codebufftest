package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemSpade;

public class ItemPyroxeneShovel extends ItemSpade {
    public ItemPyroxeneShovel() {
        super(ModMaterial.PYROXENE);
        setRegistryName("pyroxene_shovel");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_shovel");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
