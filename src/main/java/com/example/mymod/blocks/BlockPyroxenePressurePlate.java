package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockPyroxenePressurePlate extends BlockPressurePlate {
    public BlockPyroxenePressurePlate() {
        super(Material.WOOD, Sensitivity.MOBS);
        setSoundType(SoundType.WOOD);
        setRegistryName("pyroxene_pressure_plate");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_pressure_plate");
        setCreativeTab(MyMod.CREATIVE_TAB);
        setHardness(0.5F);
        setResistance(0.5F);
    }
}
