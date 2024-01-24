package net.stro.memesfortheboys.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stro.memesfortheboys.MemesfortheBoys;

public class ModItems
{
    public static final Item ROBBITE_INGOT = registerItem("robbite_ingot", new Item(new FabricItemSettings()));
    public static final Item ROBBITE_SCRAP = registerItem("robbite_scrap", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(ROBBITE_INGOT);
        entries.add(ROBBITE_SCRAP);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(MemesfortheBoys.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        MemesfortheBoys.LOGGER.info("Registering Mod Items for " + MemesfortheBoys.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
