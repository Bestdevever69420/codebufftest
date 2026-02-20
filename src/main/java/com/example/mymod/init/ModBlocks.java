package com.example.mymod.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
    public static Block pyroxene_slab;
    public static Block pyroxene_stairs;
    public static Block pyroxene_lamp;
    public static BlockPyroxeneFurnace pyroxene_furnace;
    public static BlockPyroxeneFurnace pyroxene_furnace_on;

    public static void init() {
        pyroxene_block = new BlockPyroxene();
        pyroxene_ore = new BlockPyroxeneOre();
        pyroxene_bricks = new BlockPyroxeneBricks();
        pyroxene_pillar = new BlockPyroxenePillar();
        pyroxene_slab = new BlockPyroxeneSlab();
        pyroxene_stairs = new BlockPyroxeneStairs(pyroxene_block.getDefaultState());
        pyroxene_lamp = new BlockPyroxeneLamp();
        pyroxene_furnace = new BlockPyroxeneFurnace(false);
        pyroxene_furnace_on = new BlockPyroxeneFurnace(true);

        BlockPyroxeneFurnace.INACTIVE = pyroxene_furnace;
        BlockPyroxeneFurnace.ACTIVE = pyroxene_furnace_on;
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
            pyroxene_block, pyroxene_ore,
            pyroxene_bricks, pyroxene_pillar, pyroxene_slab, pyroxene_stairs, pyroxene_lamp,
            pyroxene_furnace, pyroxene_furnace_on
        );
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            createItemBlock(pyroxene_block),
            createItemBlock(pyroxene_ore),
            createItemBlock(pyroxene_bricks),
            createItemBlock(pyroxene_pillar),
            createItemBlock(pyroxene_slab),
            createItemBlock(pyroxene_stairs),
            createItemBlock(pyroxene_lamp),
            createItemBlock(pyroxene_furnace)
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
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
            new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
