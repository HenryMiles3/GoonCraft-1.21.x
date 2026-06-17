package com.nightmare.gooncraft.item;

import com.nightmare.gooncraft.GoonCraft;
import com.nightmare.gooncraft.item.custom.ChiselItem;
import com.nightmare.gooncraft.item.custom.CumBucketItem;
import com.nightmare.gooncraft.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GoonCraft.MOD_ID);

    public static final DeferredItem<Item> CUMBUCKET = ITEMS.register("bucketofcum",
            () -> new CumBucketItem(new Item.Properties().stacksTo(1).food(ModFoodProperties.TASTYCUM)));
    public static final DeferredItem<Item> TYRONEBUCKET = ITEMS.register("bucketoftyrone",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)));
    public static final DeferredItem<Item> RAWCUM =ITEMS.register("rawcum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REFINEDCUM = ITEMS.register("refinedcum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));
    public static final DeferredItem<Item> CUMANE = ITEMS.register("cumanefuel",
            () -> new FuelItem(new Item.Properties(), 800));
    public static final DeferredItem<Item> DEACTIVATEDBUTANE = ITEMS.register("deactivatedbutanefuel",
            () -> new FuelItem(new Item.Properties(), 10));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
