package com.example.mymod.tools;

import com.example.mymod.MyMod;
import net.minecraft.item.ItemSword;

public class ItemPyroxeneSword extends ItemSword {
    public ItemPyroxeneSword() {
        super(ModMaterial.PYROXENE);
        setRegistryName("pyroxene_sword");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_sword");
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
