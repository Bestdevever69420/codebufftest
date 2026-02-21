package com.example.mymod.world;

import com.example.mymod.init.ModBlocks;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

public class WorldGenPyroxene3Tree extends WorldGenAbstractTree {
    private static final IBlockState LOG = ModBlocks.pyroxene3_wood.getDefaultState().withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Y);
    private static final IBlockState LEAVES = ModBlocks.pyroxene3_leaves.getDefaultState();

    public WorldGenPyroxene3Tree(boolean notify) {
        super(notify);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position) {
        int height = rand.nextInt(3) + 5; // Slightly shorter for Pyroxene3
        boolean flag = true;

        if (position.getY() >= 1 && position.getY() + height + 1 <= 256) {
            for (int i = position.getY(); i <= position.getY() + 1 + height; ++i) {
                int j = 1;
                if (i == position.getY()) {
                    j = 0;
                }
                if (i >= position.getY() + height - 1) {
                    j = 2;
                }
                for (int k = position.getX() - j; k <= position.getX() + j && flag; ++k) {
                    for (int l = position.getZ() - j; l <= position.getZ() + j && flag; ++l) {
                        if (i >= 0 && i < 256) {
                            if (!isReplaceable(worldIn, new BlockPos(k, i, l))) {
                                flag = false;
                            }
                        } else {
                            flag = false;
                        }
                    }
                }
            }
        } else {
            flag = false;
        }

        if (!flag) {
            return false;
        } else {
            BlockPos down = position.down();
            IBlockState state = worldIn.getBlockState(down);
            boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (BlockSapling)Blocks.SAPLING);

            if (isSoil && position.getY() < 256 - height - 1) {
                state.getBlock().onPlantGrow(state, worldIn, down, position);
                int j2 = height - rand.nextInt(2);
                int k2 = 1;
                byte b0 = 0;

                for (int l2 = 0; l2 <= j2; ++l2) {
                    BlockPos blockpos1 = position.up(l2);
                    IBlockState state1 = worldIn.getBlockState(blockpos1);
                    if (state1.getBlock().isAir(state1, worldIn, blockpos1) || state1.getBlock().isLeaves(state1, worldIn, blockpos1)) {
                        this.setBlockAndNotifyAdequately(worldIn, blockpos1, LOG);
                    }

                    if (l2 > 0) {
                        if (rand.nextInt(3) > 0 && !worldIn.isAirBlock(position.add(-1, l2, 0))) {
                            this.setBlockAndNotifyAdequately(worldIn, position.add(-1, l2, 0), LOG.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
                        }
                        if (rand.nextInt(3) > 0 && !worldIn.isAirBlock(position.add(1, l2, 0))) {
                            this.setBlockAndNotifyAdequately(worldIn, position.add(1, l2, 0), LOG.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.X));
                        }
                        if (rand.nextInt(3) > 0 && !worldIn.isAirBlock(position.add(0, l2, -1))) {
                            this.setBlockAndNotifyAdequately(worldIn, position.add(0, l2, -1), LOG.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z));
                        }
                        if (rand.nextInt(3) > 0 && !worldIn.isAirBlock(position.add(0, l2, 1))) {
                            this.setBlockAndNotifyAdequately(worldIn, position.add(0, l2, 1), LOG.withProperty(BlockLog.LOG_AXIS, BlockLog.EnumAxis.Z));
                        }
                    }
                }

                // Pyroxene3 trees have a unique cyan leaf canopy
                for (int i3 = -2; i3 <= 2; ++i3) {
                    for (int l3 = -2; l3 <= 2; ++l3) {
                        if ((i3 > -2 && i3 < 2 || l3 > -2 && l3 < 2) && (i3 == 0 && l3 == 0 ? false : rand.nextInt(3) != 0)) {
                            this.setBlockAndNotifyAdequately(worldIn, position.add(i3, height - 1, l3), LEAVES);
                        }
                    }
                }

                for (int j3 = -1; j3 <= 1; ++j3) {
                    for (int k3 = -1; k3 <= 1; ++k3) {
                        if (rand.nextInt(2) == 0) {
                            this.setBlockAndNotifyAdequately(worldIn, position.add(j3, height - 2, k3), LEAVES);
                        }
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }
}
