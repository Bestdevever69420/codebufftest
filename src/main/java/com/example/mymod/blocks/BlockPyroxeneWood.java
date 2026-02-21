package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

public class BlockPyroxeneWood extends BlockRotatedPillar {
    public BlockPyroxeneWood() {
        super(Material.WOOD);
        setRegistryName("pyroxene_wood");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_wood");
        setHardness(4.0F);
        setResistance(8.0F);
        // setHarvestLevel("axe", 0); // Removed - caused crash
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
