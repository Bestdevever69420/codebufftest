package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPyroxene3PressurePlate extends BlockPressurePlate {
    public BlockPyroxene3PressurePlate() {
        super(Material.WOOD, Sensitivity.MOBS);
        setSoundType(SoundType.WOOD);
        setRegistryName("pyroxene3_pressure_plate");
        setUnlocalizedName(MyMod.MODID + ".pyroxene3_pressure_plate");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(0.5F);
        setResistance(0.5F);
    }
}
