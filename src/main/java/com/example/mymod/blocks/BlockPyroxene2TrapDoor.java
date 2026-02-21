package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

public class BlockPyroxene2TrapDoor extends BlockTrapDoor {
    public BlockPyroxene2TrapDoor() {
        super(Material.WOOD);
        setRegistryName("pyroxene2_trapdoor");
        setUnlocalizedName(MyMod.MODID + ".pyroxene2_trapdoor");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("axe", 0);
    }
}
