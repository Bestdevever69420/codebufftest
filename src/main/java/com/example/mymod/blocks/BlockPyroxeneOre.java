package com.example.mymod.blocks;

import com.example.mymod.MyMod;
import com.example.mymod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockPyroxeneOre extends Block {
    public BlockPyroxeneOre() {
        super(Material.ROCK);
        setRegistryName("pyroxene_ore");
        setUnlocalizedName(MyMod.MODID + ".pyroxene_ore");
        setHardness(3.0F);
        setResistance(5.0F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MyMod.CREATIVE_TAB);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.pyroxene_ingot;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getBlockState().getValidStates().iterator().next(), random, fortune)) {
            int i = random.nextInt(fortune + 2) - 1;
            if (i < 0) {
                i = 0;
            }
            return this.quantityDropped(random) * (i + 1);
        } else {
            return this.quantityDropped(random);
        }
    }

    @Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        return true;
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) {
            return 3 + RANDOM.nextInt(5);
        }
        return 0;
    }
}
