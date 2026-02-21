package com.example.mymod.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Pyroxene1 - Crystal Pink Material
 * Tier: Between Iron and Diamond
 * Strength: High enchantability (easy to enchant), good efficiency
 * Weakness: Lower durability than diamond
 * 
 * Balance Philosophy: Great for early-to-mid game where enchanting is accessible
 */
public class ModMaterial {
    // Vanilla reference:
    // Wood: durability 59, efficiency 2.0, damage 2.0, harvest 0, enchant 15
    // Stone: durability 131, efficiency 4.0, damage 3.0, harvest 1, enchant 5
    // Iron: durability 250, efficiency 6.0, damage 3.0, harvest 2, enchant 14
    // Diamond: durability 1561, efficiency 8.0, damage 3.0, harvest 3, enchant 10
    // Gold: durability 32, efficiency 12.0, damage 3.0, harvest 1, enchant 22
    
    // Pyroxene1: Iron tier with diamond-like efficiency, very high enchantability
    // Trade-off: Lower durability than diamond
    public static final Item.ToolMaterial PYROXENE = EnumHelper.addToolMaterial(
        "PYROXENE",
        2, // harvest level (same as iron - can mine iron but not diamond blocks)
        350, // durability: between iron (250) and diamond (1561)
        7.5F, // efficiency: better than iron (6.0), less than diamond (8.0)
        3.0F, // attack damage: same as iron/diamond
        18 // enchantability: higher than gold (22) is too much, so 18 is good
    );
}
