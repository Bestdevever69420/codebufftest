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

public class BiomePyroxeneDesert extends Biome {
    protected static final WorldGenPyroxene2Tree TREE_PYX2 = new WorldGenPyroxene2Tree(false);

    public BiomePyroxeneDesert() {
        super(new BiomeProperties("Pyroxene Desert")
                .setBaseHeight(0.125F)
                .setHeightVariation(0.05F)
                .setTemperature(2.0F)
                .setRainfall(0.0F)
                .setRainDisabled());

        // Orange/amber themed terrain using pyroxene2 blocks
        this.topBlock = Blocks.SAND.getDefaultState();
        this.fillerBlock = Blocks.SAND.getDefaultState();
        
        // Clear default spawns
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    @Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        // Orange/amber themed desert terrain
        this.topBlock = Blocks.SAND.getDefaultState();
        this.fillerBlock = Blocks.SAND.getDefaultState();

        if (noiseVal > 1.5D) {
            // High elevation - pyroxene2 crystal blocks
            this.topBlock = ModBlocks.pyroxene2_block.getDefaultState();
            this.fillerBlock = ModBlocks.pyroxene2_block.getDefaultState();
        } else if (noiseVal > 0.5D) {
            // Medium elevation - pyroxene2 hardened sand/stone
            this.topBlock = ModBlocks.pyroxene2_planks.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }

    @Override
    public List<Biome.SpawnListEntry> getSpawnableList(EnumCreatureType creatureType) {
        return this.spawnableCreatureList;
    }

    @Override
    public void decorate(World worldIn, Random rand, BlockPos pos) {
        // Rare Pyroxene2 trees in desert
        if (rand.nextInt(8) == 0) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            TREE_PYX2.generate(worldIn, rand, pos.add(x, 0, z));
        }
        
        // Generate pyroxene2 ore crystals scattered in desert
        for (int i = 0; i < rand.nextInt(2) + 1; i++) {
            if (rand.nextInt(4) == 0) {
                int x = rand.nextInt(16) + 8;
                int z = rand.nextInt(16) + 8;
                BlockPos orePos = pos.add(x, rand.nextInt(4) + 1, z);
                if (worldIn.isAirBlock(orePos)) {
                    worldIn.setBlockState(orePos, ModBlocks.pyroxene2_ore.getDefaultState(), 2);
                }
            }
        }
        
        // Generate pyroxene2 crystal pillars (like ancient ruins)
        if (rand.nextInt(4) == 0) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            for (int h = 0; h < rand.nextInt(4) + 2; h++) {
                BlockPos pillarPos = pos.add(x, h + 1, z);
                if (worldIn.isAirBlock(pillarPos)) {
                    worldIn.setBlockState(pillarPos, ModBlocks.pyroxene2_bricks.getDefaultState(), 2);
                }
            }
        }

        super.decorate(worldIn, rand, pos);
    }
}
