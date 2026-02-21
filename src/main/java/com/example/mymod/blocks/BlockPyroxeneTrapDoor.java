package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

public class BlockPyroxeneTrapDoor extends BlockTrapDoor {
    public BlockPyroxeneTrapDoor() {
        super(Material.WOOD);
        setRegistryName("pyroxene_trapdoor");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_trapdoor");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(3.0F);
        setResistance(5.0F);
        // setHarvestLevel("axe", 0); // Removed - caused crash
    }
}
