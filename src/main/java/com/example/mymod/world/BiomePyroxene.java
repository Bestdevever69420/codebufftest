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

public class BiomePyroxene extends Biome {
    protected static final WorldGenPyroxeneTree TREE_PYX1 = new WorldGenPyroxeneTree();
    protected static final WorldGenPyroxene2Tree TREE_PYX2 = new WorldGenPyroxene2Tree(false);
    protected static final WorldGenPyroxene3Tree TREE_PYX3 = new WorldGenPyroxene3Tree(false);

    public BiomePyroxene() {
        super(new BiomeProperties("Pyroxene Forest")
                .setBaseHeight(0.2F)
                .setHeightVariation(0.2F)
                .setTemperature(0.5F)
                .setRainfall(0.8F)
                .setRainDisabled());

        // Crystal pink themed terrain using pyroxene blocks
        this.topBlock = ModBlocks.pyroxene_planks.getDefaultState();
        this.fillerBlock = ModBlocks.pyroxene_wood.getDefaultState();
        
        // Clear default spawns and add custom ones
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(net.minecraft.entity.passive.EntityRabbit.class, 4, 2, 3));
    }

    @Override
    public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal) {
        // Crystal pink themed terrain using pyroxene blocks
        this.topBlock = ModBlocks.pyroxene_planks.getDefaultState();
        this.fillerBlock = ModBlocks.pyroxene_wood.getDefaultState();

        if (noiseVal > 1.0D) {
            // High elevation - pyroxene crystal blocks
            this.topBlock = ModBlocks.pyroxene_block.getDefaultState();
            this.fillerBlock = ModBlocks.pyroxene_block.getDefaultState();
        } else if (noiseVal > 0.0D) {
            // Medium elevation - pyroxene leaves
            this.topBlock = ModBlocks.pyroxene_leaves.getDefaultState();
        }

        this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
    }

    @Override
    public List<Biome.SpawnListEntry> getSpawnableList(EnumCreatureType creatureType) {
        return this.spawnableCreatureList;
    }

    @Override
    public void decorate(World worldIn, Random rand, BlockPos pos) {
        // Generate more trees - all three Pyroxene variants
        int treeCount = rand.nextInt(10) + 8; // 8-17 trees
        for (int i = 0; i < treeCount; i++) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            // Randomly choose between Pyroxene1, Pyroxene2, or Pyroxene3 tree
            int treeType = rand.nextInt(3);
            if (treeType == 0) {
                TREE_PYX1.generate(worldIn, rand, pos.add(x, 0, z));
            } else if (treeType == 1) {
                TREE_PYX2.generate(worldIn, rand, pos.add(x, 0, z));
            } else {
                TREE_PYX3.generate(worldIn, rand, pos.add(x, 0, z));
            }
        }
        
        // Generate pyroxene ore as decorative feature (scattered crystals)
        for (int i = 0; i < rand.nextInt(3) + 1; i++) {
            if (rand.nextInt(3) == 0) {
                int x = rand.nextInt(16) + 8;
                int z = rand.nextInt(16) + 8;
                BlockPos orePos = pos.add(x, rand.nextInt(8) + 4, z);
                if (worldIn.isAirBlock(orePos)) {
                    worldIn.setBlockState(orePos, ModBlocks.pyroxene_ore.getDefaultState(), 2);
                }
            }
        }
        
        // Generate pyroxene2 ore as rare decorative feature
        if (rand.nextInt(6) == 0) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            BlockPos orePos = pos.add(x, rand.nextInt(12) + 8, z);
            if (worldIn.isAirBlock(orePos)) {
                worldIn.setBlockState(orePos, ModBlocks.pyroxene2_ore.getDefaultState(), 2);
            }
        }

        // Generate pyroxene3 ore as very rare decorative feature
        if (rand.nextInt(12) == 0) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            BlockPos orePos = pos.add(x, rand.nextInt(16) + 10, z);
            if (worldIn.isAirBlock(orePos)) {
                worldIn.setBlockState(orePos, ModBlocks.pyroxene3_ore.getDefaultState(), 2);
            }
        }
        
        // Generate decorative pyroxene lamp flowers (glowing crystals)
        for (int i = 0; i < rand.nextInt(4) + 1; i++) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            BlockPos lampPos = pos.add(x, 1, z);
            if (worldIn.isAirBlock(lampPos)) {
                worldIn.setBlockState(lampPos, ModBlocks.pyroxene_lamp.getDefaultState(), 2);
            }
        }

        // Generate pyroxene crystal formations (bricks)
        for (int i = 0; i < rand.nextInt(2) + 1; i++) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            BlockPos brickPos = pos.add(x, 1, z);
            if (worldIn.isAirBlock(brickPos)) {
                worldIn.setBlockState(brickPos, ModBlocks.pyroxene_bricks.getDefaultState(), 2);
            }
        }

        // Generate pyroxene2 crystal pillars on hills
        if (rand.nextInt(5) == 0) {
            int x = rand.nextInt(16) + 8;
            int z = rand.nextInt(16) + 8;
            for (int h = 0; h < rand.nextInt(3) + 2; h++) {
                BlockPos pillarPos = pos.add(x, h + 1, z);
                if (worldIn.isAirBlock(pillarPos)) {
                    worldIn.setBlockState(pillarPos, ModBlocks.pyroxene2_bricks.getDefaultState(), 2);
                }
            }
        }

        super.decorate(worldIn, rand, pos);
    }
}
