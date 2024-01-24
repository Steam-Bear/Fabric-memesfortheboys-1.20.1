package net.stro.memesfortheboys.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stro.memesfortheboys.MemesfortheBoys;

public class ModBlocks
{
    public static final Block BLOCK_OF_ROBB = registerBlock("block_of_robb",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).mapColor(MapColor.RAW_IRON_PINK)));
    public static final Block ANCIENT_ROBB = registerBlock("ancient_robb",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).mapColor(MapColor.RAW_IRON_PINK)));

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MemesfortheBoys.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block)
    {
         return Registry.register(Registries.ITEM, new Identifier(MemesfortheBoys.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks()
    {
        MemesfortheBoys.LOGGER.info("Registering Blocks for " + MemesfortheBoys.MOD_ID);
    }
}
