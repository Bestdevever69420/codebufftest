package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

public class BlockPyroxeneDoor extends BlockDoor {
    public BlockPyroxeneDoor() {
        super(Material.WOOD);
        setRegistryName("pyroxene_door");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_door");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(3.0F);
        setResistance(5.0F);
        // setHarvestLevel("axe", 0); // Removed - caused crash
    }
}
