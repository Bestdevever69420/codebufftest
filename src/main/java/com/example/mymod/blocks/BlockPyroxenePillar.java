package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

public class BlockPyroxenePillar extends BlockRotatedPillar {
    public BlockPyroxenePillar() {
        super(Material.ROCK);
        setRegistryName("pyroxene_pillar");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_pillar");
        setHardness(4.0F);
        setResistance(8.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
