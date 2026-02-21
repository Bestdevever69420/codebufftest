package com.example.mymod.world;

import java.util.Random;

import com.example.mymod.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenPyroxeneMineshaft extends WorldGenerator implements IWorldGenerator {
    
    public WorldGenPyroxeneMineshaft() {
        super();
    }
    
    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        return false;
    }
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() == 0) {
            generateOverworld(random, chunkX, chunkZ, world);
        }
    }
    
    private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
        int x = chunkX * 16 + 8;
        int z = chunkZ * 16 + 8;
        
        // Generate mineshaft corridor decorations - pyroxene ore veins
        if (random.nextInt(4) == 0) {
            int y = 15 + random.nextInt(30);
            WorldGenMinable pyroxeneOre = new WorldGenMinable(ModBlocks.pyroxene_ore.getDefaultState(), 4 + random.nextInt(4));
            pyroxeneOre.generate(world, random, new BlockPos(x, y, z));
        }
        
        if (random.nextInt(6) == 0) {
            int y = 20 + random.nextInt(25);
            WorldGenMinable pyroxene2Ore = new WorldGenMinable(ModBlocks.pyroxene2_ore.getDefaultState(), 3 + random.nextInt(3));
            pyroxene2Ore.generate(world, random, new BlockPos(x + 4, y, z + 4));
        }
        
        // Generate decorative crystal clusters (brick formations)
        if (random.nextInt(5) == 0) {
            int y = 10 + random.nextInt(40);
            for (int i = 0; i < 3; i++) {
                BlockPos pos = new BlockPos(x + random.nextInt(8), y + i, z + random.nextInt(8));
                if (world.isAirBlock(pos)) {
                    world.setBlockState(pos, ModBlocks.pyroxene_bricks.getDefaultState(), 2);
                }
            }
        }
        
        // Generate glowing lamp nodes
        if (random.nextInt(8) == 0) {
            int y = 20 + random.nextInt(20);
            BlockPos lampPos = new BlockPos(x, y, z);
            if (world.isAirBlock(lampPos)) {
                world.setBlockState(lampPos, ModBlocks.pyroxene_lamp.getDefaultState(), 2);
            }
        }
    }
}
