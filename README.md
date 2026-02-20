# ⛏️ My Mod — Pyroxene

A **Minecraft Forge 1.12.2** mod that adds **Pyroxene**, a fiery volcanic material slightly stronger than diamond but with lower durability.

## 🔥 Features

### Ore Generation
- **Pyroxene Ore** spawns in the Overworld between Y 5–15, in veins of 3–7 blocks
- Drops ingots directly when mined; supports Fortune enchantment
- Can also be smelted in a furnace for 1.0 XP

### Building Blocks
| Block | Recipe |
|-------|--------|
| Pyroxene Block | 9 Ingots (3×3) |
| Pyroxene Bricks | 4 Blocks (2×2) → 4 Bricks |
| Pyroxene Pillar | 2 Blocks (stacked) → 2 Pillars |
| Pyroxene Slab | 3 Blocks (row) → 6 Slabs |
| Pyroxene Stairs | 6 Blocks (stair pattern) → 4 Stairs |
| Pyroxene Lamp | 1 Block + 4 Glowstone Dust → 4 Lamps |

### Tools
Pyroxene tools are crafted with standard vanilla patterns using **Pyroxene Ingots** and **Sticks**.

| Tool | Attack Damage | Efficiency |
|------|--------------|------------|
| Pickaxe | 5.0 | 10.0 |
| Axe | 9.0 | 10.0 |
| Sword | 8.0 | — |
| Shovel | 5.5 | 10.0 |
| Hoe | — | — |

### Armor
Full Pyroxene armor set (Helmet, Chestplate, Leggings, Boots) crafted with standard vanilla patterns using **Pyroxene Ingots**.

### Pyroxene Furnace
- Smelts items **2× faster** than the vanilla furnace
- Crafted with 8 Pyroxene Blocks in a furnace pattern

### Storage Conversions
- 9 Ingots ↔ 1 Block
- 9 Nuggets ↔ 1 Ingot

### Creative Tab
All Pyroxene items are grouped under a dedicated creative tab.

## 📦 Installation (Players)

1. Install [Minecraft Forge for 1.12.2](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.12.2.html)
2. Download the latest `mymod-1.0.0.jar` from [Releases](https://github.com/Bestdevever69420/codebufftest/releases)
3. Place the JAR in your `.minecraft/mods/` folder
4. Launch Minecraft with the Forge profile

## 🛠️ Building from Source

### Requirements
- **Java 8** (JDK 1.8) — required for Minecraft Forge 1.12.2 modding
- Gradle is included via the wrapper (no separate install needed)

### Installing Java 8

```bash
# Ubuntu/Debian
sudo apt install openjdk-8-jdk
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
```

On Windows, download [Adoptium Temurin JDK 8](https://adoptium.net/temurin/releases/?version=8) and set `JAVA_HOME` to the install directory.

### Build

```bash
# First time only — set up the Forge development workspace
./gradlew setupDecompWorkspace

# Build the mod JAR
./gradlew build
```

The compiled mod JAR will be in `build/libs/mymod-1.0.0.jar`.

## 🧑‍💻 Development

```bash
# Set up IDE workspace (optional)
./gradlew eclipse    # For Eclipse
./gradlew idea       # For IntelliJ IDEA (or just open build.gradle as project)

# Run Minecraft client with the mod loaded
./gradlew runClient

# Run Minecraft server with the mod loaded
./gradlew runServer
```

## 📁 Project Structure

```
src/main/java/com/example/mymod/
├── MyMod.java              # Main mod entry point
├── MyModCreativeTab.java   # Creative inventory tab
├── GuiHandler.java         # GUI handler for custom furnace
├── armor/                  # Pyroxene armor items
├── blocks/                 # Block classes, furnace tile entity & GUI
├── init/                   # Registration classes (ModBlocks, ModItems, ModTools, ModArmor, ModRecipes)
├── items/                  # Pyroxene Ingot & Nugget
├── tools/                  # Tool items & material definitions
└── world/                  # Ore world generation

src/main/resources/
├── assets/mymod/
│   ├── blockstates/        # Block state definitions
│   ├── lang/en_us.lang     # English translations
│   └── models/             # Block & item models
├── mcmod.info              # Mod metadata
└── pack.mcmeta             # Resource pack metadata
```

## 👤 Author

**greatgamer69420** — [GitHub](https://github.com/Bestdevever69420)

## 📄 License

This project is open source. Feel free to use and modify it.
