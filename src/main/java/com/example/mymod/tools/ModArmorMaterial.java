package com.example.mymod.tools;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Pyroxene1 - Crystal Pink Armor
 * Tier: Between Iron and Diamond
 * Strength: Very high enchantability, decent protection
 * Weakness: Lower durability than diamond
 * 
 * Balance Philosophy: Easy to enchant, good for early-to-mid game
 */
public class ModArmorMaterial {
    // Vanilla reference:
    // Leather: durability 5, armor [1,2,3,1], enchant 15
    // Iron: durability 15, armor [2,5,6,2], enchant 14
    // Gold: durability 7, armor [2,5,6,2], enchant 25
    // Diamond: durability 33, armor [3,6,8,3], enchant 10
    
    // Pyroxene1: Iron-tier protection with very high enchantability
    // Trade-off: Lower durability than diamond
    public static final ItemArmor.ArmorMaterial PYROXENE = EnumHelper.addArmorMaterial(
        "PYROXENE",
        "mymod:pyroxene",
        15, // durability multiplier: same as iron (15)
        new int[]{2, 5, 6, 2}, // damage reduction: same as iron [helmet, chest, legs, boots]
        18, // enchantability: higher than gold (25) is too much, so 18
        SoundEvents.ITEM_ARMOR_EQUIP_IRON,
        1.0F // toughness: same as iron (1.0)
    );
}
