package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemSpade;

public class ItemPyroxene2Shovel extends ItemSpade {
    public ItemPyroxene2Shovel() {
        super(ModMaterial2.PYROXENE2);
        setRegistryName("pyroxene2_shovel");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_shovel");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}