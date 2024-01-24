package net.stro.memesfortheboys.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stro.memesfortheboys.MemesfortheBoys;
import net.stro.memesfortheboys.block.ModBlocks;

public class ModItemGroups
{
    public static final ItemGroup ROBBITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MemesfortheBoys.MOD_ID, "robbite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.robbite"))
                    .icon(() -> new ItemStack(ModBlocks.BLOCK_OF_ROBB)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ROBBITE_INGOT);
                        entries.add(ModItems.ROBBITE_SCRAP);
                        entries.add(ModBlocks.BLOCK_OF_ROBB);
                        entries.add(ModBlocks.ANCIENT_ROBB);
                    }).build());

    public static void registerItemGroups()
    {
        MemesfortheBoys.LOGGER.info("Registering Item Groups for " + MemesfortheBoys.MOD_ID);
    }
}
