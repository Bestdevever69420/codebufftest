package com.example.mymod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.example.mymod.MyMod;

public class ModRecipes {
    public static void init() {
        // Ingot from block (shapeless - unpack)
        GameRegistry.addShapelessRecipe(
            new ResourceLocation(MyMod.MODID, "pyroxene_ingot_from_block"),
            new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene_ingot, 9),
            Ingredient.fromStacks(new ItemStack(ModBlocks.pyroxene_block)));

        // Block from ingots
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_block"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_block),
            "III",
            "III",
            "III",
            'I', ModItems.pyroxene_ingot);

        // Nugget from ingot (shapeless - unpack)
        GameRegistry.addShapelessRecipe(
            new ResourceLocation(MyMod.MODID, "pyroxene_nugget_from_ingot"),
            new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene_nugget, 9),
            Ingredient.fromStacks(new ItemStack(ModItems.pyroxene_ingot)));

        // Ingot from nuggets
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_ingot_from_nuggets"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModItems.pyroxene_ingot),
            "NNN",
            "NNN",
            "NNN",
            'N', ModItems.pyroxene_nugget);

        // --- Decorative Blocks ---

        // Bricks (2x2 pyroxene blocks = 4 bricks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_bricks"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_bricks, 4),
            "BB",
            "BB",
            'B', ModBlocks.pyroxene_block);

        // Pillar (2 pyroxene blocks stacked = 2 pillars)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_pillar"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_pillar, 2),
            "B",
            "B",
            'B', ModBlocks.pyroxene_block);

        // Slab (3 pyroxene blocks in a row = 6 slabs)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_slab"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_slab, 6),
            "BBB",
            'B', ModBlocks.pyroxene_block);

        // Stairs (6 pyroxene blocks = 4 stairs)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_stairs"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_stairs, 4),
            "B  ",
            "BB ",
            "BBB",
            'B', ModBlocks.pyroxene_block);

        // Lamp (pyroxene block + glowstone dust)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_lamp"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_lamp, 4),
            " G ",
            "GBG",
            " G ",
            'B', ModBlocks.pyroxene_block,
            'G', Items.GLOWSTONE_DUST);

        // --- Furnace ---

        // Pyroxene Furnace (like vanilla furnace but with pyroxene blocks)
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_furnace"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModBlocks.pyroxene_furnace),
            "BBB",
            "B B",
            "BBB",
            'B', ModBlocks.pyroxene_block);

        // --- Tools ---

        // Pickaxe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_pickaxe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_pickaxe),
            "III",
            " S ",
            " S ",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // Axe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_axe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_axe),
            "II",
            "IS",
            " S",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // Sword
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_sword"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_sword),
            "I",
            "I",
            "S",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // Shovel
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_shovel"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_shovel),
            "I",
            "S",
            "S",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // Hoe
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_hoe"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModTools.pyroxene_hoe),
            "II",
            " S",
            " S",
            'I', ModItems.pyroxene_ingot,
            'S', Items.STICK);

        // --- Armor ---

        // Helmet
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_helmet"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene_helmet),
            "III",
            "I I",
            'I', ModItems.pyroxene_ingot);

        // Chestplate
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_chestplate"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene_chestplate),
            "I I",
            "III",
            "III",
            'I', ModItems.pyroxene_ingot);

        // Leggings
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_leggings"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene_leggings),
            "III",
            "I I",
            "I I",
            'I', ModItems.pyroxene_ingot);

        // Boots
        GameRegistry.addShapedRecipe(new ResourceLocation(MyMod.MODID, "pyroxene_boots"), new ResourceLocation(MyMod.MODID, ""),
            new ItemStack(ModArmor.pyroxene_boots),
            "I I",
            "I I",
            'I', ModItems.pyroxene_ingot);

        // --- Smelting ---

        // Ore to ingot
        GameRegistry.addSmelting(ModBlocks.pyroxene_ore, new ItemStack(ModItems.pyroxene_ingot), 1.0F);
    }
}
