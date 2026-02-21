package com.example.mymod.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.example.mymod.MyMod;
import com.example.mymod.blocks.*;

@Mod.EventBusSubscriber(modid = MyMod.MODID)
public class ModBlocks {
    public static Block pyroxene_block;
    public static Block pyroxene_ore;
    public static Block pyroxene_bricks;
    public static Block pyroxene_pillar;
    public static BlockPyroxeneHalfSlab pyroxene_slab;
    public static BlockPyroxeneDoubleSlab pyroxene_double_slab;
    public static Block pyroxene_stairs;
    public static Block pyroxene_lamp;
    public static BlockPyroxeneFurnace pyroxene_furnace;
    public static BlockPyroxeneFurnace pyroxene_furnace_on;
    public static Block pyroxene_wood;
    public static Block pyroxene_planks;
    public static BlockPyroxeneLeaves pyroxene_leaves;
    public static BlockPyroxeneSapling pyroxene_sapling;
    public static BlockPyroxenePlanksStairs pyroxene_planks_stairs;
    public static BlockPyroxenePlanksHalfSlab pyroxene_planks_slab;
    public static BlockPyroxenePlanksDoubleSlab pyroxene_planks_double_slab;
    public static BlockPyroxeneFence pyroxene_fence;
    public static BlockPyroxeneFenceGate pyroxene_fence_gate;
    public static BlockPyroxeneDoor pyroxene_door;
    public static BlockPyroxeneTrapDoor pyroxene_trapdoor;
    public static BlockPyroxeneButton pyroxene_button;
    public static BlockPyroxenePressurePlate pyroxene_pressure_plate;
    
    // Pyroxene2 blocks - Orange/Amber themed (different from Pyroxene1 crystal pink)
    public static Block pyroxene2_block;
    public static Block pyroxene2_ore;
    public static Block pyroxene2_bricks;
    // Pyroxene2 Wood Set (basic)
    public static Block pyroxene2_wood;
    public static Block pyroxene2_planks;
    public static BlockPyroxene2Leaves pyroxene2_leaves;
    public static BlockPyroxene2Sapling pyroxene2_sapling;
    // Pyroxene2 Wood Set (functional)
    public static BlockPyroxene2PlanksStairs pyroxene2_planks_stairs;
    public static BlockSlab pyroxene2_planks_slab;
    public static BlockSlab pyroxene2_planks_double_slab;
    public static BlockPyroxene2Fence pyroxene2_fence;
    public static BlockPyroxene2FenceGate pyroxene2_fence_gate;
    public static BlockPyroxene2Door pyroxene2_door;
    public static BlockPyroxene2TrapDoor pyroxene2_trapdoor;
    public static BlockPyroxene2Button pyroxene2_button;
    public static BlockPyroxene2PressurePlate pyroxene2_pressure_plate;
    
    // Pyroxene3 blocks - Cyan/Teal themed (balanced material)
    public static Block pyroxene3_block;
    public static Block pyroxene3_ore;
    public static Block pyroxene3_bricks;
    // Pyroxene3 Wood Set (basic)
    public static Block pyroxene3_wood;
    public static Block pyroxene3_planks;
    public static BlockPyroxene3Leaves pyroxene3_leaves;
    public static BlockPyroxene3Sapling pyroxene3_sapling;
    // Pyroxene3 Wood Set (functional)
    public static BlockPyroxene3PlanksStairs pyroxene3_planks_stairs;
    public static BlockSlab pyroxene3_planks_slab;
    public static BlockSlab pyroxene3_planks_double_slab;
    public static BlockPyroxene3Fence pyroxene3_fence;
    public static BlockPyroxene3FenceGate pyroxene3_fence_gate;
    public static BlockPyroxene3Door pyroxene3_door;
    public static BlockPyroxene3TrapDoor pyroxene3_trapdoor;
    public static BlockPyroxene3Button pyroxene3_button;
    public static BlockPyroxene3PressurePlate pyroxene3_pressure_plate;

    public static void init() {
        pyroxene_block = new BlockPyroxene();
        pyroxene_ore = new BlockPyroxeneOre();
        pyroxene_bricks = new BlockPyroxeneBricks();
        pyroxene_pillar = new BlockPyroxenePillar();
        pyroxene_slab = new BlockPyroxeneHalfSlab();
        pyroxene_double_slab = new BlockPyroxeneDoubleSlab();
        pyroxene_stairs = new BlockPyroxeneStairs(pyroxene_block.getDefaultState());
        pyroxene_lamp = new BlockPyroxeneLamp();
        pyroxene_furnace = new BlockPyroxeneFurnace(false);
        pyroxene_furnace_on = new BlockPyroxeneFurnace(true);
        pyroxene_wood = new BlockPyroxeneWood();
        pyroxene_planks = new BlockPyroxenePlanks();
        pyroxene_leaves = new BlockPyroxeneLeaves();
        pyroxene_sapling = new BlockPyroxeneSapling();
        pyroxene_planks_stairs = new BlockPyroxenePlanksStairs(ModBlocks.pyroxene_planks.getDefaultState());
        pyroxene_planks_slab = new BlockPyroxenePlanksHalfSlab();
        pyroxene_planks_double_slab = new BlockPyroxenePlanksDoubleSlab();
        pyroxene_fence = new BlockPyroxeneFence();
        pyroxene_fence_gate = new BlockPyroxeneFenceGate();
        pyroxene_door = new BlockPyroxeneDoor();
        pyroxene_trapdoor = new BlockPyroxeneTrapDoor();
        pyroxene_button = new BlockPyroxeneButton();
        pyroxene_pressure_plate = new BlockPyroxenePressurePlate();
        
        // Pyroxene2 blocks - Orange/Amber themed
        pyroxene2_block = new BlockPyroxene2Block();
        pyroxene2_ore = new BlockPyroxene2Ore();
        pyroxene2_bricks = new BlockPyroxene2Bricks();
        // Pyroxene2 Wood Set (basic)
        pyroxene2_wood = new BlockPyroxene2Wood();
        pyroxene2_planks = new BlockPyroxene2Planks();
        pyroxene2_leaves = new BlockPyroxene2Leaves();
        pyroxene2_sapling = new BlockPyroxene2Sapling();
        // Pyroxene2 Wood Set (functional)
        pyroxene2_planks_stairs = new BlockPyroxene2PlanksStairs(pyroxene2_planks.getDefaultState());
        pyroxene2_planks_slab = new BlockPyroxene2PlanksSlab() {
            @Override
            public boolean isDouble() {
                return false;
            }
        };
        pyroxene2_planks_double_slab = new BlockPyroxene2PlanksSlab() {
            @Override
            public boolean isDouble() {
                return true;
            }
        };
        pyroxene2_fence = new BlockPyroxene2Fence();
        pyroxene2_fence_gate = new BlockPyroxene2FenceGate();
        pyroxene2_door = new BlockPyroxene2Door();
        pyroxene2_trapdoor = new BlockPyroxene2TrapDoor();
        pyroxene2_button = new BlockPyroxene2Button();
        pyroxene2_pressure_plate = new BlockPyroxene2PressurePlate();
        
        // Pyroxene3 blocks - Cyan/Teal themed
        pyroxene3_block = new BlockPyroxene3Block();
        pyroxene3_ore = new BlockPyroxene3Ore();
        pyroxene3_bricks = new BlockPyroxene3Bricks();
        // Pyroxene3 Wood Set (basic)
        pyroxene3_wood = new BlockPyroxene3Wood();
        pyroxene3_planks = new BlockPyroxene3Planks();
        pyroxene3_leaves = new BlockPyroxene3Leaves();
        pyroxene3_sapling = new BlockPyroxene3Sapling();
        // Pyroxene3 Wood Set (functional)
        pyroxene3_planks_stairs = new BlockPyroxene3PlanksStairs(pyroxene3_planks.getDefaultState());
        pyroxene3_planks_slab = new BlockPyroxene3PlanksSlab() {
            @Override
            public boolean isDouble() {
                return false;
            }
        };
        pyroxene3_planks_double_slab = new BlockPyroxene3PlanksSlab() {
            @Override
            public boolean isDouble() {
                return true;
            }
        };
        pyroxene3_fence = new BlockPyroxene3Fence();
        pyroxene3_fence_gate = new BlockPyroxene3FenceGate();
        pyroxene3_door = new BlockPyroxene3Door();
        pyroxene3_trapdoor = new BlockPyroxene3TrapDoor();
        pyroxene3_button = new BlockPyroxene3Button();
        pyroxene3_pressure_plate = new BlockPyroxene3PressurePlate();

        BlockPyroxeneFurnace.INACTIVE = pyroxene_furnace;
        BlockPyroxeneFurnace.ACTIVE = pyroxene_furnace_on;
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
            pyroxene_block, pyroxene_ore,
            pyroxene_bricks, pyroxene_pillar, pyroxene_slab, pyroxene_double_slab, pyroxene_stairs, pyroxene_lamp,
            pyroxene_furnace, pyroxene_furnace_on,
            pyroxene_wood, pyroxene_planks,
            pyroxene_leaves, pyroxene_sapling,
            pyroxene_planks_stairs, pyroxene_planks_slab, pyroxene_planks_double_slab,
            pyroxene_fence, pyroxene_fence_gate, pyroxene_door, pyroxene_trapdoor,
            pyroxene_button, pyroxene_pressure_plate,
            pyroxene2_block, pyroxene2_ore, pyroxene2_bricks,
            pyroxene2_wood, pyroxene2_planks, pyroxene2_leaves, pyroxene2_sapling,
            pyroxene2_planks_stairs, pyroxene2_planks_slab, pyroxene2_planks_double_slab,
            pyroxene2_fence, pyroxene2_fence_gate, pyroxene2_door, pyroxene2_trapdoor,
            pyroxene2_button, pyroxene2_pressure_plate,
            pyroxene3_block, pyroxene3_ore, pyroxene3_bricks,
            pyroxene3_wood, pyroxene3_planks, pyroxene3_leaves, pyroxene3_sapling,
            pyroxene3_planks_stairs, pyroxene3_planks_slab, pyroxene3_planks_double_slab,
            pyroxene3_fence, pyroxene3_fence_gate, pyroxene3_door, pyroxene3_trapdoor,
            pyroxene3_button, pyroxene3_pressure_plate
        );
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            createItemBlock(pyroxene_block),
            createItemBlock(pyroxene_ore),
            createItemBlock(pyroxene_bricks),
            createItemBlock(pyroxene_pillar),
            new ItemSlab(pyroxene_slab, pyroxene_slab, pyroxene_double_slab).setRegistryName(pyroxene_slab.getRegistryName()),
            createItemBlock(pyroxene_stairs),
            createItemBlock(pyroxene_lamp),
            createItemBlock(pyroxene_furnace),
            createItemBlock(pyroxene_wood),
            createItemBlock(pyroxene_planks),
            createItemBlock(pyroxene_leaves),
            createItemBlock(pyroxene_sapling),
            new ItemSlab(pyroxene_planks_slab, pyroxene_planks_slab, pyroxene_planks_double_slab).setRegistryName(pyroxene_planks_slab.getRegistryName()),
            createItemBlock(pyroxene_planks_stairs),
            createItemBlock(pyroxene_fence),
            createItemBlock(pyroxene_fence_gate),
            createItemBlock(pyroxene_door),
            createItemBlock(pyroxene_trapdoor),
            createItemBlock(pyroxene_button),
            createItemBlock(pyroxene_pressure_plate),
            createItemBlock(pyroxene2_block),
            createItemBlock(pyroxene2_ore),
            createItemBlock(pyroxene2_bricks),
            createItemBlock(pyroxene3_block),
            createItemBlock(pyroxene3_ore),
            createItemBlock(pyroxene3_bricks),
            createItemBlock(pyroxene2_wood),
            createItemBlock(pyroxene2_planks),
            createItemBlock(pyroxene2_leaves),
            createItemBlock(pyroxene2_sapling),
            createItemBlock(pyroxene2_planks_stairs),
            new ItemSlab(pyroxene2_planks_slab, pyroxene2_planks_slab, pyroxene2_planks_double_slab).setRegistryName(pyroxene2_planks_slab.getRegistryName()),
            createItemBlock(pyroxene2_fence),
            createItemBlock(pyroxene2_fence_gate),
            createItemBlock(pyroxene2_door),
            createItemBlock(pyroxene2_trapdoor),
            createItemBlock(pyroxene2_button),
            createItemBlock(pyroxene2_pressure_plate),
            createItemBlock(pyroxene3_wood),
            createItemBlock(pyroxene3_planks),
            createItemBlock(pyroxene3_leaves),
            createItemBlock(pyroxene3_sapling),
            createItemBlock(pyroxene3_planks_stairs),
            new ItemSlab(pyroxene3_planks_slab, pyroxene3_planks_slab, pyroxene3_planks_double_slab).setRegistryName(pyroxene3_planks_slab.getRegistryName()),
            createItemBlock(pyroxene3_fence),
            createItemBlock(pyroxene3_fence_gate),
            createItemBlock(pyroxene3_door),
            createItemBlock(pyroxene3_trapdoor),
            createItemBlock(pyroxene3_button),
            createItemBlock(pyroxene3_pressure_plate)
        );
    }

    private static ItemBlock createItemBlock(Block block) {
        return (ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName());
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(pyroxene_block);
        registerModel(pyroxene_ore);
        registerModel(pyroxene_bricks);
        registerModel(pyroxene_pillar);
        registerModel(pyroxene_slab);
        registerModel(pyroxene_stairs);
        registerModel(pyroxene_lamp);
        registerModel(pyroxene_furnace);
        registerModel(pyroxene_wood);
        registerModel(pyroxene_planks);
        registerModel(pyroxene_leaves);
        registerModel(pyroxene_sapling);
        registerModel(pyroxene_planks_stairs);
        registerModel(pyroxene_planks_slab);
        registerModel(pyroxene_fence);
        registerModel(pyroxene_fence_gate);
        registerModel(pyroxene_door);
        registerModel(pyroxene_trapdoor);
        registerModel(pyroxene_button);
        registerModel(pyroxene_pressure_plate);
        registerModel(pyroxene2_block);
        registerModel(pyroxene2_ore);
        registerModel(pyroxene2_bricks);
        registerModel(pyroxene3_block);
        registerModel(pyroxene3_ore);
        registerModel(pyroxene3_bricks);
        // Pyroxene2 wood set
        registerModel(pyroxene2_wood);
        registerModel(pyroxene2_planks);
        registerModel(pyroxene2_leaves);
        registerModel(pyroxene2_sapling);
        registerModel(pyroxene2_planks_stairs);
        registerModel(pyroxene2_planks_slab);
        registerModel(pyroxene2_fence);
        registerModel(pyroxene2_fence_gate);
        registerModel(pyroxene2_door);
        registerModel(pyroxene2_trapdoor);
        registerModel(pyroxene2_button);
        registerModel(pyroxene2_pressure_plate);
        // Pyroxene3 wood set
        registerModel(pyroxene3_wood);
        registerModel(pyroxene3_planks);
        registerModel(pyroxene3_leaves);
        registerModel(pyroxene3_sapling);
        registerModel(pyroxene3_planks_stairs);
        registerModel(pyroxene3_planks_slab);
        registerModel(pyroxene3_fence);
        registerModel(pyroxene3_fence_gate);
        registerModel(pyroxene3_door);
        registerModel(pyroxene3_trapdoor);
        registerModel(pyroxene3_button);
        registerModel(pyroxene3_pressure_plate);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
            new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
