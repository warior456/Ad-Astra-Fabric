package net.mrscauthd.beyond_earth.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.registry.Registry;
import net.mrscauthd.beyond_earth.util.ModIdentifier;
import net.mrscauthd.beyond_earth.items.HammerItem;

public class ModItems {

    public static final ItemGroup ITEM_GROUP_NORMAL = FabricItemGroupBuilder.build(new ModIdentifier("tab_normal"), () -> new ItemStack(ModItems.CHEESE));
    public static final ItemGroup ITEM_GROUP_BASICS = FabricItemGroupBuilder.build(new ModIdentifier("tab_basics"), () -> new ItemStack(ModItems.HAMMER)); // Temp icon.
    public static final ItemGroup ITEM_GROUP_BLOCKS = FabricItemGroupBuilder.build(new ModIdentifier("tab_blocks"), () -> new ItemStack(Blocks.IRON_ORE)); // Temp icon.
    public static final ItemGroup ITEM_GROUP_MATERIALS = FabricItemGroupBuilder.build(new ModIdentifier("tab_materials"), () -> new ItemStack(ModItems.IRON_PLATE));
    public static final ItemGroup ITEM_GROUP_FLAGS = FabricItemGroupBuilder.build(new ModIdentifier("tab_flags"), () -> new ItemStack(ModItems.FLAG_PURPLE));

    // Flag Items
    public static final BlockItem FLAG = new TallBlockItem(ModBlocks.FLAG_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_BLUE = new TallBlockItem(ModBlocks.FLAG_BLUE_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_BROWN = new TallBlockItem(ModBlocks.FLAG_BROWN_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_CYAN = new TallBlockItem(ModBlocks.FLAG_CYAN_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_GRAY = new TallBlockItem(ModBlocks.FLAG_GRAY_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_GREEN = new TallBlockItem(ModBlocks.FLAG_GREEN_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_LIGHT_BLUE = new TallBlockItem(ModBlocks.FLAG_LIGHT_BLUE_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_LIME = new TallBlockItem(ModBlocks.FLAG_LIME_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_MAGENTA = new TallBlockItem(ModBlocks.FLAG_MAGENTA_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_ORANGE = new TallBlockItem(ModBlocks.FLAG_ORANGE_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_PINK = new TallBlockItem(ModBlocks.FLAG_PINK_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_PURPLE = new TallBlockItem(ModBlocks.FLAG_PURPLE_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_RED = new TallBlockItem(ModBlocks.FLAG_RED_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));
    public static final BlockItem FLAG_YELLOW = new TallBlockItem(ModBlocks.FLAG_YELLOW_BLOCK, new Item.Settings().group(ITEM_GROUP_FLAGS));

    // Items.
    public static final Item CHEESE = new Item(new FabricItemSettings().group(ITEM_GROUP_NORMAL).food(new FoodComponent.Builder().hunger(4).saturationModifier(3.0f).build()));
    public static final Item HAMMER = new HammerItem(new FabricItemSettings().group(ITEM_GROUP_BASICS).maxCount(1).maxDamage(9));
    public static final Item IRON_STICK = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item OXYGEN_GEAR = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item OXYGEN_TANK = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item WHEEL = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item ENGINE_FRAME = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item ENGINE_FAN = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item ROCKET_NOSE_CONE = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item STEEL_ENGINE = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item DESH_ENGINE = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item OSTRUM_ENGINE = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item CALORITE_ENGINE = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item STEEL_TANK = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item DESH_TANK = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item OSTRUM_TANK = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item CALORITE_TANK = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item ROCKET_FIN = new Item(new FabricItemSettings().group(ITEM_GROUP_BASICS));

    public static final Item STEEL_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item DESH_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item OSTRUM_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item CALORITE_INGOT = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));

    public static final Item ICE_SHARD = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));

    public static final Item IRON_PLATE = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item DESH_PLATE = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));

    public static final Item COMPRESSED_STEEL = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item COMPRESSED_DESH = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item COMPRESSED_OSTRUM = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item COMPRESSED_CALORITE = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));

    public static final Item STEEL_NUGGET = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item DESH_NUGGET = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item OSTRUM_NUGGET = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item CALORITE_NUGGET = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));

    public static final Item RAW_DESH = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item RAW_OSTRUM = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));
    public static final Item RAW_CALORITE = new Item(new FabricItemSettings().group(ITEM_GROUP_MATERIALS));

    // Block Items.
    public static final Item COAL_TORCH = new WallStandingBlockItem(ModBlocks.COAL_TORCH_BLOCK, ModBlocks.WALL_COAL_TORCH_BLOCK, new FabricItemSettings().group(ITEM_GROUP_BASICS));
    public static final Item COAL_LANTERN = new BlockItem(ModBlocks.COAL_LANTERN_BLOCK, new Item.Settings().group(ITEM_GROUP_BASICS));

    public static final BlockItem STEEL_BLOCK = new BlockItem(ModBlocks.STEEL_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem DESH_BLOCK = new BlockItem(ModBlocks.DESH_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem OSTRUM_BLOCK = new BlockItem(ModBlocks.OSTRUM_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem CALORITE_BLOCK = new BlockItem(ModBlocks.CALORITE_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem RAW_DESH_BLOCK = new BlockItem(ModBlocks.RAW_DESH_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem RAW_OSTRUM_BLOCK = new BlockItem(ModBlocks.RAW_OSTRUM_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem RAW_CALORITE_BLOCK = new BlockItem(ModBlocks.RAW_CALORITE_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem IRON_PLATING_BLOCK = new BlockItem(ModBlocks.IRON_PLATING_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem RUSTED_IRON_PILLAR_BLOCK = new BlockItem(ModBlocks.RUSTED_IRON_PILLAR_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem RUSTED_IRON_PLATING_BLOCK = new BlockItem(ModBlocks.RUSTED_IRON_PLATING_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem BLUE_IRON_PLATING_BLOCK = new BlockItem(ModBlocks.BLUE_IRON_PLATING_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem INFERNAL_SPIRE_BLOCK = new BlockItem(ModBlocks.INFERNAL_SPIRE_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem IRON_MARK_BLOCK = new BlockItem(ModBlocks.IRON_MARK_BLOCK, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem SKY_STONE = new BlockItem(ModBlocks.SKY_STONE, new Item.Settings().group(ITEM_GROUP_BLOCKS));

    public static final BlockItem MOON_STONE = new BlockItem(ModBlocks.MOON_STONE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MOON_STONE_BRICKS = new BlockItem(ModBlocks.MOON_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem CRACKED_MOON_STONE_BRICKS = new BlockItem(ModBlocks.CRACKED_MOON_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MOON_STONE_BRICK_SLAB = new BlockItem(ModBlocks.MOON_STONE_BRICK_SLAB, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MOON_STONE_BRICK_STAIRS = new BlockItem(ModBlocks.MOON_STONE_BRICK_STAIRS, new Item.Settings().group(ITEM_GROUP_BLOCKS));

    public static final BlockItem MARS_STONE = new BlockItem(ModBlocks.MARS_STONE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MARS_STONE_BRICKS = new BlockItem(ModBlocks.MARS_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem CRACKED_MARS_STONE_BRICKS = new BlockItem(ModBlocks.CRACKED_MARS_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MARS_STONE_BRICK_SLAB = new BlockItem(ModBlocks.MARS_STONE_BRICK_SLAB, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MARS_STONE_BRICK_STAIRS = new BlockItem(ModBlocks.MARS_STONE_BRICK_STAIRS, new Item.Settings().group(ITEM_GROUP_BLOCKS));

    public static final BlockItem MERCURY_STONE = new BlockItem(ModBlocks.MERCURY_STONE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MERCURY_STONE_BRICKS = new BlockItem(ModBlocks.MERCURY_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem CRACKED_MERCURY_STONE_BRICKS = new BlockItem(ModBlocks.CRACKED_MERCURY_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MERCURY_STONE_BRICK_SLAB = new BlockItem(ModBlocks.MERCURY_STONE_BRICK_SLAB, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MERCURY_STONE_BRICK_STAIRS = new BlockItem(ModBlocks.MERCURY_STONE_BRICK_STAIRS, new Item.Settings().group(ITEM_GROUP_BLOCKS));

    public static final BlockItem VENUS_STONE = new BlockItem(ModBlocks.VENUS_STONE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_STONE_BRICKS = new BlockItem(ModBlocks.VENUS_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem CRACKED_VENUS_STONE_BRICKS = new BlockItem(ModBlocks.CRACKED_VENUS_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_STONE_BRICK_SLAB = new BlockItem(ModBlocks.VENUS_STONE_BRICK_SLAB, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_STONE_BRICK_STAIRS = new BlockItem(ModBlocks.VENUS_STONE_BRICK_STAIRS, new Item.Settings().group(ITEM_GROUP_BLOCKS));

    public static final BlockItem VENUS_SANDSTONE = new BlockItem(ModBlocks.VENUS_SANDSTONE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_SANDSTONE_BRICKS = new BlockItem(ModBlocks.VENUS_SANDSTONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem CRACKED_VENUS_SANDSTONE_BRICKS = new BlockItem(ModBlocks.CRACKED_VENUS_SANDSTONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_SANDSTONE_BRICK_SLAB = new BlockItem(ModBlocks.VENUS_SANDSTONE_BRICK_SLAB, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_SANDSTONE_BRICK_STAIRS = new BlockItem(ModBlocks.VENUS_SANDSTONE_BRICK_STAIRS, new Item.Settings().group(ITEM_GROUP_BLOCKS));

    public static final BlockItem PERMAFROST = new BlockItem(ModBlocks.PERMAFROST_STONE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_STONE = new BlockItem(ModBlocks.GLACIO_STONE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_STONE_BRICKS = new BlockItem(ModBlocks.GLACIO_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem CRACKED_GLACIO_STONE_BRICKS = new BlockItem(ModBlocks.CRACKED_GLACIO_STONE_BRICKS, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_STONE_BRICK_SLAB = new BlockItem(ModBlocks.GLACIO_STONE_BRICK_SLAB, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_STONE_BRICK_STAIRS = new BlockItem(ModBlocks.GLACIO_STONE_BRICK_STAIRS, new Item.Settings().group(ITEM_GROUP_BLOCKS));

//    public static final BlockItem ROCKET_LAUNCH_PAD = new BlockItem(ModBlocks.ROCKET_LAUNCH_PAD, new Item.Settings().group(ITEM_GROUP_BLOCKS));

    public static final BlockItem MOON_SAND = new BlockItem(ModBlocks.MOON_SAND, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MARS_SAND = new BlockItem(ModBlocks.MARS_SAND, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_SAND = new BlockItem(ModBlocks.VENUS_SAND, new Item.Settings().group(ITEM_GROUP_BLOCKS));

    public static final BlockItem MOON_CHEESE_ORE = new BlockItem(ModBlocks.MOON_CHEESE_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MOON_DESH_ORE = new BlockItem(ModBlocks.MOON_DESH_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MOON_IRON_ORE = new BlockItem(ModBlocks.MOON_IRON_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MOON_ICE_SHARD = new BlockItem(ModBlocks.MOON_ICE_SHARD_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MARS_IRON_ORE = new BlockItem(ModBlocks.MARS_IRON_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MARS_DIAMOND_ORE = new BlockItem(ModBlocks.MARS_DIAMOND_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MARS_OSTRUM_ORE = new BlockItem(ModBlocks.MARS_OSTRUM_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MARS_ICE_SHARD_ORE = new BlockItem(ModBlocks.MARS_ICE_SHARD_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem MERCURY_IRON_ORE = new BlockItem(ModBlocks.MERCURY_IRON_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_COAL_ORE = new BlockItem(ModBlocks.VENUS_COAL_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_GOLD_ORE = new BlockItem(ModBlocks.VENUS_GOLD_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_DIAMOND_ORE = new BlockItem(ModBlocks.VENUS_DIAMOND_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem VENUS_CALORITE_ORE = new BlockItem(ModBlocks.VENUS_CALORITE_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_ICE_SHARD_ORE = new BlockItem(ModBlocks.GLACIO_ICE_SHARD_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_COAL_ORE = new BlockItem(ModBlocks.GLACIO_COAL_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_COPPER_ORE = new BlockItem(ModBlocks.GLACIO_COPPER_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_IRON_ORE = new BlockItem(ModBlocks.GLACIO_IRON_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));
    public static final BlockItem GLACIO_LAPIS_ORE = new BlockItem(ModBlocks.GLACIO_LAPIS_ORE, new Item.Settings().group(ITEM_GROUP_BLOCKS));


    public static void register() {

        // Flag Items.
        register("flag", FLAG);
        register("flag_blue", FLAG_BLUE);
        register("flag_brown", FLAG_BROWN);
        register("flag_cyan", FLAG_CYAN);
        register("flag_gray", FLAG_GRAY);
        register("flag_green", FLAG_GREEN);
        register("flag_light_blue", FLAG_LIGHT_BLUE);
        register("flag_lime", FLAG_LIME);
        register("flag_magenta", FLAG_MAGENTA);
        register("flag_orange", FLAG_ORANGE);
        register("flag_pink", FLAG_PINK);
        register("flag_purple", FLAG_PURPLE);
        register("flag_red", FLAG_RED);
        register("flag_yellow", FLAG_YELLOW);

        // Items.
        register("cheese", CHEESE);
        register("hammer", HAMMER);
        register("iron_stick", IRON_STICK);
        register("oxygen_gear", OXYGEN_GEAR);
        register("oxygen_tank", OXYGEN_TANK);
        register("wheel", WHEEL);
        register("engine_frame", ENGINE_FRAME);
        register("engine_fan", ENGINE_FAN);
        register("rocket_nose_cone", ROCKET_NOSE_CONE);
        register("steel_engine", STEEL_ENGINE);
        register("desh_engine", DESH_ENGINE);
        register("ostrum_engine", OSTRUM_ENGINE);
        register("calorite_engine", CALORITE_ENGINE);
        register("steel_tank", STEEL_TANK);
        register("desh_tank", DESH_TANK);
        register("ostrum_tank", OSTRUM_TANK);
        register("calorite_tank", CALORITE_TANK);
        register("rocket_fin", ROCKET_FIN);

        register("steel_ingot", STEEL_INGOT);
        register("desh_ingot", DESH_INGOT);
        register("ostrum_ingot", OSTRUM_INGOT);
        register("calorite_ingot", CALORITE_INGOT);

        register("ice_shard", ICE_SHARD);

        register("iron_plate", IRON_PLATE);
        register("desh_plate", DESH_PLATE);

        register("compressed_steel", COMPRESSED_STEEL);
        register("compressed_desh", COMPRESSED_DESH);
        register("compressed_ostrum", COMPRESSED_OSTRUM);
        register("compressed_calorite", COMPRESSED_CALORITE);

        register("steel_nugget", STEEL_NUGGET);
        register("desh_nugget", DESH_NUGGET);
        register("ostrum_nugget", OSTRUM_NUGGET);
        register("calorite_nugget", CALORITE_NUGGET);

        register("raw_desh", RAW_DESH);
        register("raw_ostrum", RAW_OSTRUM);
        register("raw_calorite", RAW_CALORITE);

        // Block Items.
        register("coal_torch", COAL_TORCH);
        register("coal_lantern", COAL_LANTERN);

        register("steel_block", STEEL_BLOCK);
        register("desh_block", DESH_BLOCK);
        register("ostrum_block", OSTRUM_BLOCK);
        register("calorite_block", CALORITE_BLOCK);
        register("raw_desh_block", RAW_DESH_BLOCK);
        register("raw_ostrum_block", RAW_OSTRUM_BLOCK);
        register("raw_calorite_block", RAW_CALORITE_BLOCK);
        register("iron_plating_block", IRON_PLATING_BLOCK);
        register("rusted_iron_pillar_block", RUSTED_IRON_PILLAR_BLOCK);
        register("rusted_iron_plating_block", RUSTED_IRON_PLATING_BLOCK);
        register("blue_iron_plating_block", BLUE_IRON_PLATING_BLOCK);
        register("infernal_spire_block", INFERNAL_SPIRE_BLOCK);
        register("iron_mark_block", IRON_MARK_BLOCK);
        register("sky_stone", SKY_STONE);

        register("moon_stone", MOON_STONE);
        register("moon_stone_bricks", MOON_STONE_BRICKS);
        register("cracked_moon_stone_bricks", CRACKED_MOON_STONE_BRICKS);
        register("moon_stone_brick_slab", MOON_STONE_BRICK_SLAB);
        register("moon_stone_brick_stairs", MOON_STONE_BRICK_STAIRS);

        register("mars_stone", MARS_STONE);
        register("mars_stone_bricks", MARS_STONE_BRICKS);
        register("cracked_mars_stone_bricks", CRACKED_MARS_STONE_BRICKS);
        register("mars_stone_brick_slab", MARS_STONE_BRICK_SLAB);
        register("mars_stone_brick_stairs", MARS_STONE_BRICK_STAIRS);

        register("mercury_stone", MERCURY_STONE);
        register("mercury_stone_bricks", MERCURY_STONE_BRICKS);
        register("cracked_mercury_stone_bricks", CRACKED_MERCURY_STONE_BRICKS);
        register("mercury_stone_brick_slab", MERCURY_STONE_BRICK_SLAB);
        register("mercury_stone_brick_stairs", MERCURY_STONE_BRICK_STAIRS);

        register("venus_stone", VENUS_STONE);
        register("venus_stone_bricks", VENUS_STONE_BRICKS);
        register("cracked_venus_stone_bricks", CRACKED_VENUS_STONE_BRICKS);
        register("venus_stone_brick_slab", VENUS_STONE_BRICK_SLAB);
        register("venus_stone_brick_stairs", VENUS_STONE_BRICK_STAIRS);

        register("venus_sandstone", VENUS_SANDSTONE);
        register("venus_sandstone_bricks", VENUS_SANDSTONE_BRICKS);
        register("cracked_venus_sandstone_bricks", CRACKED_VENUS_SANDSTONE_BRICKS);
        register("venus_sandstone_brick_slab", VENUS_SANDSTONE_BRICK_SLAB);
        register("venus_sandstone_brick_stairs", VENUS_SANDSTONE_BRICK_STAIRS);

        register("permafrost", PERMAFROST);
        register("glacio_stone", GLACIO_STONE);
        register("glacio_stone_bricks", GLACIO_STONE_BRICKS);
        register("cracked_glacio_stone_bricks", CRACKED_GLACIO_STONE_BRICKS);
        register("glacio_stone_brick_slab", GLACIO_STONE_BRICK_SLAB);
        register("glacio_stone_brick_stairs", GLACIO_STONE_BRICK_STAIRS);

//        register("rocket_launch_pad", ROCKET_LAUNCH_PAD);

        register("moon_sand", MOON_SAND);
        register("mars_sand", MARS_SAND);
        register("venus_sand", VENUS_SAND);

        register("moon_cheese_ore", MOON_CHEESE_ORE);
        register("moon_desh_ore", MOON_DESH_ORE);
        register("moon_iron_ore", MOON_IRON_ORE);
        register("moon_ice_shard_ore", MOON_ICE_SHARD);
        register("mars_iron_ore", MARS_IRON_ORE);
        register("mars_diamond_ore", MARS_DIAMOND_ORE);
        register("mars_ostrum_ore", MARS_OSTRUM_ORE);
        register("mars_ice_shard_ore", MARS_ICE_SHARD_ORE);
        register("mercury_iron_ore", MERCURY_IRON_ORE);
        register("venus_coal_ore", VENUS_COAL_ORE);
        register("venus_gold_ore", VENUS_GOLD_ORE);
        register("venus_diamond_ore", VENUS_DIAMOND_ORE);
        register("venus_calorite_ore", VENUS_CALORITE_ORE);
        register("glacio_ice_shard_ore", GLACIO_ICE_SHARD_ORE);
        register("glacio_coal_ore", GLACIO_COAL_ORE);
        register("glacio_copper_ore", GLACIO_COPPER_ORE);
        register("glacio_iron_ore", GLACIO_IRON_ORE);
        register("glacio_lapis_ore", GLACIO_LAPIS_ORE);
    }

    public static void register(String id, Item item) {
        Registry.register(Registry.ITEM, new ModIdentifier(id), item);
    }
}