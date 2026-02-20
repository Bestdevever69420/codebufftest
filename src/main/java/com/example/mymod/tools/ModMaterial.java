package com.example.mymod.tools;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterial {
    // Tool material: slightly stronger than diamond, lower durability
    // Diamond: efficiency 8.0, attack damage 3.0, durability 1561, enchantability 10
    // Pyroxene: efficiency 9.0, attack damage 3.5, durability 1200, enchantability 15
    public static final Item.ToolMaterial PYROXENE = EnumHelper.addToolMaterial(
        "PYROXENE",
        3, // harvest level (same as diamond)
        1200, // durability (lower than diamond's 1561)
        9.0F, // efficiency (higher than diamond's 8.0)
        3.5F, // attack damage (higher than diamond's 3.0)
        15 // enchantability (higher than diamond's 10)
    );
}
