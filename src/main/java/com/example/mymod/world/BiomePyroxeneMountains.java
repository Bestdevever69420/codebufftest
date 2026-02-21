package com.example.mymod.world;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkPrimer;

import com.example.mymod.init.ModBlocks;

import java.util.List;
import java.util.Random;

public class BiomePyroxeneMountains extends Biome {
    protected static final WorldGenPyroxeneTree TREE_PYX1 = new WorldGenPyroxeneTree();
    protected static final WorldGenPyroxene2Tree TREE_PYX2 = new WorldGenPyroxene2Tree(false);

    public BiomePyroxeneMountains() {
        super(new BiomeProperties("Pyroxene Mountains")
                .setBaseHeight(1.8F)
                .setHeightVariation(0.5F)
                .setTemperature(0.3F)
                .setRainfall(0.4F));

        // Crystal mountain terrain
        this.topBlock = ModBlocks.pyroxene_block.getDefaultState();
        this.fillerBlock = ModBlocks.pyroxene_ore.getDefaultState();
        
        // Clear default spawns
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    @Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        // High crystal mountains
        if (noiseVal > 1.2D) {
            this.topBlock = ModBlocks.pyroxene_pillar.getDefaultState();
            this.fillerBlock = ModBlocks.pyroxene_block.getDefaultState();
        } else if (noiseVal > 0.5D) {
            this.topBlock = ModBlocks.pyroxene_bricks.getDefaultState();
            this.fillerBlock = ModBlocks.pyroxene_ore.getDefaultState();
        } else if (noiseVal > 0.0D) {
            this.topBlock = ModBlocks.pyroxene_block.getDefaultState();
            this.fillerBlock = ModBlocks.pyroxene_lamp.getDefaultState();
        } else {
            this.topBlock = ModBlocks.pyroxene_planks.getDefaultState();
            this.fillerBlock = ModBlocks.pyroxene_wood.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }

    @Override
    public List<Biome.SpawnListEntry> getSpawnableList(EnumCreatureType creatureType) {
        return this.spawnableMonsterList;
    }

    @Override
    public void decorate(World worldIn, Random rand, BlockPos pos) {
        // Generate tall crystal spires
        if (rand.nextInt(3) == 0) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            int height = 5 + rand.nextInt(8);
            for (int h = 0; h < height; h++) {
                BlockPos spirePos = pos.add(x, h + 1, z);
                if (worldIn.isAirBlock(spirePos)) {
                    worldIn.setBlockState(spirePos, ModBlocks.pyroxene_pillar.getDefaultState(), 2);
                }
            }
            // Add glowing crystal on top
            BlockPos topPos = pos.add(x, height + 1, z);
            if (worldIn.isAirBlock(topPos)) {
                worldIn.setBlockState(topPos, ModBlocks.pyroxene_lamp.getDefaultState(), 2);
            }
        }
        
        // Generate ore clusters in mountains
        for (int i = 0; i < rand.nextInt(3) + 1; i++) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            BlockPos orePos = pos.add(x, rand.nextInt(10) + 5, z);
            if (worldIn.isAirBlock(orePos)) {
                if (rand.nextInt(2) == 0) {
                    worldIn.setBlockState(orePos, ModBlocks.pyroxene_ore.getDefaultState(), 2);
                } else {
                    worldIn.setBlockState(orePos, ModBlocks.pyroxene2_ore.getDefaultState(), 2);
                }
            }
        }
        
        // Generate brick formations
        for (int i = 0; i < rand.nextInt(2) + 1; i++) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            BlockPos brickPos = pos.add(x, 1, z);
            if (worldIn.isAirBlock(brickPos)) {
                worldIn.setBlockState(brickPos, ModBlocks.pyroxene_bricks.getDefaultState(), 2);
            }
        }
        
        // Rare trees on mountain slopes
        if (rand.nextInt(6) == 0) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            if (rand.nextBoolean()) {
                TREE_PYX1.generate(worldIn, rand, pos.add(x, 0, z));
            } else {
                TREE_PYX2.generate(worldIn, rand, pos.add(x, 0, z));
            }
        }

        super.decorate(worldIn, rand, pos);
    }
}
