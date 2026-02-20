package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyroxeneLamp extends Block {
    public BlockPyroxeneLamp() {
        super(Material.GLASS);
        setRegistryName("pyroxene_lamp");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_lamp");
        setHardness(0.3F);
        setResistance(1.5F);
        setHarvestLevel("pickaxe", 0);
        setLightLevel(1.0F);
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
