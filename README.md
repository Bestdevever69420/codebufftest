# ⛏️ Pyroxene Mod

A **Minecraft Forge 1.12.2** mod that adds the **Pyroxene** material pack — three unique volcanic crystal materials with distinct themes: Pyroxene (crystal pink), Pyroxene2 (orange/amber), and Pyroxene3 (cyan/teal).

## 🔥 Features

### Three Material Tiers

| Material | Theme | Color | Special Features |
|----------|-------|-------|------------------|
| **Pyroxene** | Crystal Pink | #FF69B4 | Original volcanic material, fastest smelting |
| **Pyroxene2** | Orange/Amber | #FFA500 | Orange-themed variant |
| **Pyroxene3** | Cyan/Teal | #00CED1 | Balanced material variant |

### Ore Generation
- **Pyroxene Ore** — Pink crystal ore, spawns Y=0-64 in Overworld
- **Pyroxene2 Ore** — Orange ore variant
- **Pyroxene3 Ore** — Cyan ore variant
- All ores drop ingots directly when mined (supports Fortune)
- Can also be smelted in a furnace for XP

### Building Blocks (Each Material)
| Block Type | Pyroxene | Pyroxene2 | Pyroxene3 |
|------------|----------|-----------|-----------|
| Ore | ✅ | ✅ | ✅ |
| Block | ✅ | ✅ | ✅ |
| Bricks | ✅ | ✅ | ✅ |
| Wood | ✅ | ✅ | ✅ |
| Planks | ✅ | ✅ | ✅ |
| Leaves | ✅ | ✅ | ✅ |
| Sapling | ✅ | ✅ | ✅ |
| Stairs | ✅ | ✅ | ✅ |
| Slab | ✅ | ✅ | ✅ |
| Fence | ✅ | ✅ | ✅ |
| Fence Gate | ✅ | ✅ | ✅ |
| Door | ✅ | ✅ | ✅ |
| Trapdoor | ✅ | ✅ | ✅ |
| Button | ✅ | ✅ | ✅ |
| Pressure Plate | ✅ | ✅ | ✅ |
| Pillar | ✅ | ❌ | ❌ |
| Lamp | ✅ | ❌ | ❌ |
| Furnace | ✅ | ❌ | ❌ |

### Tools (Each Material)
Crafted with standard vanilla patterns using respective ingots.

| Tool | Attack Damage | Efficiency |
|------|--------------|------------|
| Pickaxe | 5.0 | 10.0 |
| Axe | 9.0 | 10.0 |
| Sword | 8.0 | — |
| Shovel | 5.5 | 10.0 |
| Hoe | — | — |

### Armor (Each Material)
Full armor set per material (Helmet, Chestplate, Leggings, Boots).

### Boats
- Pyroxene Boat (Pink)
- Pyroxene2 Boat (Orange)
- Pyroxene3 Boat (Cyan)

### Pyroxene Furnace (Original Material Only)
- Smelts items **2× faster** than vanilla furnace
- Crafted with 8 Pyroxene Blocks

### Pyroxene Tracker
- Grants **infinite Night Vision** while in your inventory
- Crafted with 3 Pyroxene Ingots + 1 Charged Runium Chunk (from AoA3)
- Has durability: lasts 3 minutes (180 ticks) before fading away
- Glows when active
- RARE rarity while active

### Custom Biomes
| Biome | Type | Features |
|-------|------|----------|
| Pyroxene Forest | Warm | Forest with pyroxene theme |
| Pyroxene Desert | Desert | Desert with pyroxene theme |
| Pyroxene Ocean | Ocean | Ocean with pyroxene theme |
| Pyroxene Mountains | Icy | Mountain with pyroxene theme |

### World Generation
- Custom ore generation for all three ore types
- Mineshaft generation

### Dungeon Loot
- Pyroxene ores and treasure added to dungeon loot tables

## 📦 Installation (Players)

1. Install [Minecraft Forge for 1.12.2](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.12.2.html)
2. Download the latest release from [Releases](https://github.com/Bestdevever69420/codebufftest/releases)
3. Place the JAR in your `.minecraft/mods/` folder
4. Launch Minecraft with the Forge profile

**Note:** This mod requires **AoA3** (Advent of Ascension) for full mob content.

## 🛠️ Building from Source

### Requirements
- **Java 8** (JDK 1.8) — required for Minecraft Forge 1.12.2 modding
- Gradle is included via the wrapper

### Build

```bash
# Build the mod JAR
./gradlew build
```

The compiled mod JAR will be in `build/libs/`.

## 📁 Project Structure

```
src/main/java/com/example/mymod/
├── MyMod.java              # Main mod entry point
├── MyModCreativeTab.java   # Creative inventory tab
├── GuiHandler.java         # GUI handler
├── armor/                  # Armor items (Pyroxene, Pyroxene2, Pyroxene3)
├── blocks/                 # Block classes, furnace tile entity & GUI
├── entity/                 # Boat entities and renderers
├── init/                   # Registration classes
├── items/                  # Ingots & Nuggets
├── tools/                  # Tool items & materials
└── world/                 # Biome & world generation

src/main/resources/
├── assets/mymod/
│   ├── blockstates/        # 52 block state definitions
│   ├── lang/en_us.lang     # English translations
│   └── models/             # Block & item models
├── mcmod.info              # Mod metadata
└── pack.mcmeta             # Resource pack metadata
```

## 🧪 Version History

- **v1.1.0.1-take2** — Added Pyroxene Tracker item (grants Night Vision), dungeon loot tables, bug fixes
- **v1.1.0** — Major update: Added Pyroxene2 and Pyroxene3 materials, custom biomes, mineshaft world generation, boats, and AoA3 dependency
- **v1.0.1** — Fix furnace arrow bug, adjust ore spawn
- **v1.0.0** — Initial release

## 👤 Author

**greatgamer69420** — [GitHub](https://github.com/Bestdevever69420)

## 📄 License

This project is open source. Feel free to use and modify it.
