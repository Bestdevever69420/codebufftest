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

public class BiomePyroxeneOcean extends Biome {
    protected static final WorldGenPyroxene3Tree TREE_PYX3 = new WorldGenPyroxene3Tree(false);

    public BiomePyroxeneOcean() {
        super(new BiomeProperties("Pyroxene Ocean")
                .setBaseHeight(-1.8F)
                .setHeightVariation(0.1F)
                .setTemperature(0.5F)
                .setRainfall(0.8F));

        // Cyan/teal themed ocean floor using pyroxene3 blocks
        this.topBlock = ModBlocks.pyroxene3_planks.getDefaultState();
        this.fillerBlock = Blocks.GRAVEL.getDefaultState();
        
        // Clear default spawns and add water creatures
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }

    @Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        // Cyan/teal themed ocean floor
        this.topBlock = ModBlocks.pyroxene3_planks.getDefaultState();
        this.fillerBlock = Blocks.GRAVEL.getDefaultState();

        if (noiseVal > 1.0D) {
            // High elevation - coral-like pyroxene3 structures
            this.topBlock = ModBlocks.pyroxene3_bricks.getDefaultState();
            this.fillerBlock = ModBlocks.pyroxene3_bricks.getDefaultState();
        } else if (noiseVal > 0.2D) {
            // Medium elevation - pyroxene3 leaves (sea plants)
            this.topBlock = ModBlocks.pyroxene3_leaves.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }

    @Override
    public List<Biome.SpawnListEntry> getSpawnableList(EnumCreatureType creatureType) {
        return this.spawnableWaterCreatureList;
    }

    @Override
    public void decorate(World worldIn, Random rand, BlockPos pos) {
        // Generate coral-like pyroxene3 structures on ocean floor
        for (int i = 0; i < rand.nextInt(3) + 1; i++) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            BlockPos coralPos = pos.add(x, 1, z);
            if (worldIn.isAirBlock(coralPos)) {
                worldIn.setBlockState(coralPos, ModBlocks.pyroxene3_bricks.getDefaultState(), 2);
            }
        }
        
        // Generate pyroxene3 ore (rare underwater crystals)
        for (int i = 0; i < rand.nextInt(2) + 1; i++) {
            if (rand.nextInt(5) == 0) {
                int x = rand.nextInt(16) + 8;
                int z = rand.nextInt(16) + 8;
                BlockPos orePos = pos.add(x, rand.nextInt(8) + 1, z);
                if (worldIn.isAirBlock(orePos)) {
                    worldIn.setBlockState(orePos, ModBlocks.pyroxene3_ore.getDefaultState(), 2);
                }
            }
        }
        
        // Generate glowing lamps (bioluminescent crystals underwater)
        for (int i = 0; i < rand.nextInt(2) + 1; i++) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            BlockPos lampPos = pos.add(x, 1, z);
            if (worldIn.isAirBlock(lampPos)) {
                worldIn.setBlockState(lampPos, ModBlocks.pyroxene_lamp.getDefaultState(), 2);
            }
        }

        // Generate pyroxene3 crystal pillars (underwater ruins)
        if (rand.nextInt(6) == 0) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            for (int h = 0; h < rand.nextInt(3) + 2; h++) {
                BlockPos pillarPos = pos.add(x, h + 1, z);
                if (worldIn.isAirBlock(pillarPos)) {
                    worldIn.setBlockState(pillarPos, ModBlocks.pyroxene3_bricks.getDefaultState(), 2);
                }
            }
        }

        super.decorate(worldIn, rand, pos);
    }
}
