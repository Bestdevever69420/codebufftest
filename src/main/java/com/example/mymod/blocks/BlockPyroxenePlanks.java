package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPyroxenePlanks extends Block {
    public BlockPyroxenePlanks() {
        super(Material.WOOD);
        setRegistryName("pyroxene_planks");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_planks");
        setHardness(4.0F);
        setResistance(8.0F);
        // setHarvestLevel("axe", 0); // Removed - caused crash
        setCreativeTab(MyMod.CREATIVE_TAB);
    }
}
