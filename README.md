# My Mod — Pyroxene

A Minecraft Forge 1.12.2 mod that adds **Pyroxene**, a fiery volcanic material slightly stronger than diamond but with lower durability.

## Content

- **Pyroxene Ore** — Generates underground (Y 5–15), drops ingots with Fortune support
- **Pyroxene Block, Bricks, Pillar, Slab, Stairs, Lamp** — Decorative building blocks
- **Pyroxene Tools** — Pickaxe, Axe, Shovel, Hoe, Sword (higher damage/efficiency than diamond)
- **Pyroxene Armor** — Full armor set (helmet, chestplate, leggings, boots)
- **Pyroxene Furnace** — Smelts items 2× faster than vanilla

## Requirements

- **Java 8** (JDK 1.8) — Required for Minecraft Forge 1.12.2 modding
- Gradle is included via the wrapper (no separate install needed)

### Installing Java 8

```bash
# Ubuntu/Debian
sudo apt install openjdk-8-jdk

# Set JAVA_HOME before building
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
```

On Windows, download [AdoptOpenJDK 8](https://adoptium.net/temurin/releases/?version=8) and set `JAVA_HOME` to the install directory.

## Building

```bash
# First time only — set up the Forge development workspace
./gradlew setupDecompWorkspace

# Build the mod JAR
./gradlew build
```

The compiled mod JAR will be in `build/libs/mymod-1.0.0.jar`.

## Development

```bash
# Set up IDE workspace (optional)
./gradlew eclipse    # For Eclipse
./gradlew idea       # For IntelliJ IDEA (or just open build.gradle as project)

# Run Minecraft client with the mod loaded
./gradlew runClient

# Run Minecraft server with the mod loaded
./gradlew runServer
```

## Project Structure

```
├── build.gradle                    # ForgeGradle build configuration
├── src/main/java/                  # Java source code
│   └── com/example/mymod/
│       ├── MyMod.java              # Main mod class
│       ├── armor/                  # Armor items
│       ├── blocks/                 # Block classes + furnace system
│       ├── init/                   # Registration (ModBlocks, ModItems, etc.)
│       ├── items/                  # Ingot, nugget
│       ├── tools/                  # Tool items + materials
│       └── world/                  # Ore generation
└── src/main/resources/             # Assets and metadata
    ├── assets/mymod/
    │   ├── blockstates/
    │   ├── lang/en_us.lang
    │   ├── models/block/ & item/
    │   └── textures/
    ├── mcmod.info
    └── pack.mcmeta
```

## Author

greatgamer69420
