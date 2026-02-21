package com.example.mymod.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Pyroxene2 - Orange/Amber Material
 * Tier: Diamond tier (harvest level 3)
 * Strength: Very high durability AND damage output
 * Weakness: Very low enchantability - difficult to get good enchantments
 * 
 * Balance Philosophy: Powerhouse for late game but harder to optimize with enchantments
 */
public class ModMaterial2 {
    // Pyroxene2: Diamond tier with extreme durability and damage
    // Trade-off: Very low enchantability makes it harder to optimize
    public static final Item.ToolMaterial PYROXENE2 = EnumHelper.addToolMaterial(
        "PYROXENE2",
        3, // harvest level: same as diamond (can mine everything)
        1800, // durability: higher than diamond (1561) but not ridiculous
        9.0F, // efficiency: better than diamond (8.0)
        5.0F, // attack damage: significantly higher than diamond (3.0) - big advantage
        5 // enchantability: very low - worse than diamond (10), harder to enchant
    );
}
