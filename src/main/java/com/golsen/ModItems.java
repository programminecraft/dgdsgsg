package com.golsen;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.sql.Struct;

public class ModItems {
    public static final Item PISKA = registerItem("piska", new Item(new FabricItemSettings()));
    private static void addItemsToI(FabricItemGroupEntries entries) {
        entries.add(PISKA);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(golsen.MOD_ID, name), item);

    }
    public static void registerModItems() {
        golsen.LOGGER.info("REgistring " + golsen.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToI);
    }

}