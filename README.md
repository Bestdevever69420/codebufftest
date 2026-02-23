# ⛏️ Pyroxene Mod

A **Minecraft Forge 1.12.2** mod that adds the **Pyroxene** material pack — volcanic crystal materials with mining, crafting, and exploration features.

## 🔥 Features

### Pyroxene Material (Pink)
The original volcanic crystal material with the most features.

**Ores & Blocks:**
- **Pyroxene Ore** — Pink crystal ore, spawns Y=0-64 in Overworld
- **Pyroxene Block** — Decorative block
- **Pyroxene Bricks** — Decorative brick block
- **Pyroxene Pillar** — Decorative pillar block
- **Pyroxene Wood & Planks** — Building materials
- **Pyroxene Leaves, Sapling** — Tree-related blocks
- **Pyroxene Stairs & Slab** — Building blocks
- **Pyroxene Fence & Fence Gate** — Barrier blocks
- **Pyroxene Door & Trapdoor** — Redstone-compatible blocks
- **Pyroxene Button & Pressure Plate** — Redstone components
- **Pyroxene Lamp** — Emits light
- **Pyroxene Furnace** — Smelts items **2× faster** than vanilla furnace

**Tools:**
| Tool | Attack Damage | Efficiency |
|------|--------------|------------|
| Pickaxe | 5.0 | 10.0 |
| Axe | 9.0 | 10.0 |
| Sword | 8.0 | — |
| Shovel | 5.5 | 10.0 |
| Hoe | — | — |

**Armor:**
- Pyroxene Helmet, Chestplate, Leggings, Boots

**Boat:**
- Pyroxene Boat (Pink)

### Pyroxene2 (Orange)
Orange-themed variant with a balanced set of blocks.

**Ores & Blocks:**
- Pyroxene2 Ore, Block, Bricks, Wood, Planks, Leaves, Sapling, Stairs, Slab, Fence, Fence Gate, Door, Trapdoor, Button, Pressure Plate

**Tools:**
- Pyroxene2 Pickaxe, Axe, Sword, Shovel, Hoe

**Armor:**
- Pyroxene2 Helmet, Chestplate, Leggings, Boots

**Boat:**
- Pyroxene2 Boat (Orange)

### Pyroxene3 (Cyan)
Cyan/teal-themed variant.

**Ores & Blocks:**
- Pyroxene3 Ore, Block, Bricks, Wood, Planks, Leaves, Sapling, Stairs, Slab, Fence, Fence Gate, Door, Trapdoor, Button, Pressure Plate

**Tools:**
- Pyroxene3 Pickaxe, Axe, Sword, Shovel, Hoe

**Armor:**
- Pyroxene3 Helmet, Chestplate, Leggings, Boots

**Boat:**
- Pyroxene3 Boat (Cyan)

### Pyroxene Tracker
- Grants **infinite Night Vision** while in your inventory
- Crafted with 3 Pyroxene Ingots + 1 Charged Runium Chunk (from AoA3)
- Has durability: lasts 3 minutes (180 ticks) before fading away
- Glows when active
- RARE rarity while active
- **Note:** Requires AoA3 for the Charged Runium Chunk crafting ingredient

### World Generation
- **Pyroxene Ore** — Spawns Y=0-64, 8 attempts per chunk
- Mineshaft generation with Pyroxene-themed chests

### Custom Biomes
| Biome | Type | Features |
|-------|------|----------|
| Pyroxene Forest | Warm | Forest with pyroxene theme |
| Pyroxene Desert | Desert | Desert with pyroxene theme |
| Pyroxene Ocean | Ocean | Ocean with pyroxene theme |
| Pyroxene Mountains | Icy | Mountain with pyroxene theme |

### Dungeon Loot
- Pyroxene ores and treasure added to dungeon loot tables (mineshaft, dungeon, stronghold)

## 📦 Installation (Players)

1. Install [Minecraft Forge for 1.12.2](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.12.2.html)
2. Download the latest release from [Releases](https://github.com/Bestdevever69420/codebufftest/releases)
3. Place the JAR in your `.minecraft/mods/` folder
4. Launch Minecraft with the Forge profile

**Note:** This mod benefits from **AoA3** (Advent of Ascension) for the Pyroxene Tracker crafting recipe and additional mob content.

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
├── items/                  # Ingots, nuggets, boats, tracker
├── tools/                  # Tool items & materials
└── world/                  # Biome & world generation

src/main/resources/
├── assets/mymod/
│   ├── blockstates/        # Block state definitions
│   ├── lang/en_us.lang     # English translations
│   └── models/             # Block & item models
├── mcmod.info              # Mod metadata
└── pack.mcmeta             # Resource pack metadata
```

## 🧪 Version History

### Released Versions
- **v1.1.0.1-take2** — Added Pyroxene Tracker item (grants Night Vision), dungeon loot tables. This is the only working build from the 1.1.0.x series that has been tested in-game.
- **v1.0.1** — Fix furnace arrow bug, adjust ore spawn (Y=0-64, 8 attempts/chunk)
- **v1.0.0** — Initial release

### Failed 1.1.0.x Series (Not Released)
These versions were developed but had critical issues and were never successfully released to GitHub:

| Version | Date | Status | Issue |
|---------|------|--------|-------|
| **v1.1.0** | 22 Feb 2026, ~00:12 | Failed | Major update: Added Pyroxene2, Pyroxene3, 4 biomes, mineshaft generation, AoA3 dependency. Had multiple crash bugs on load. |
| **v1.1.0.1** | 22 Feb 2026, ~07:08 | Failed | Attempted fix but still had crashes. |
| **Various crash fixes** | 22 Feb 2026 | Failed | Multiple patches for ArrayIndexOutOfBoundsException, fence gate crashes, sapling crashes. |
| **6:50pm build** | ~22 Feb 2026 | Failed | Crashed on startup - specific error unknown. |
| **8:26pm build** | ~22 Feb 2026 | Failed | Crashing build - final attempt before reset. |
| **5:30pm build** | 22 Feb 2026 | Failed | Was originally part of the 1.1.0.x series until it became v1.1.0.1-take2. |

### Version Timeline
- **22 Feb 2026, 9:11am** — Development begins on 1.1.0.x series
- **22 Feb 2026, ~6:50pm** — First major crash
- **22 Feb 2026, ~8:26pm** — Final crash, series abandoned
- **23 Feb 2026** — v1.1.0.1-take2 created from working code

## 👤 Author

**greatgamer69420** — [GitHub](https://github.com/Bestdevever69420)

## 📄 License

This project is open source. Feel free to use and modify it.
