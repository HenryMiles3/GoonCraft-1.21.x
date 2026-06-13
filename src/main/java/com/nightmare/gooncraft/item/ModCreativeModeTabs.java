package com.nightmare.gooncraft.item;

import com.nightmare.gooncraft.GoonCraft;
import com.nightmare.gooncraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GoonCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> GOONCRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("gooncraftitemtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CUMBUCKET.get()))
                    .withTabsAfter(ResourceLocation.fromNamespaceAndPath(GoonCraft.MOD_ID, "gooncraftblocktab"))
                    .title(Component.translatable("creativetab.nightmaregooncraft.gooncraftitemtab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CUMBUCKET);
                        output.accept(ModItems.TYRONEBUCKET);
                        output.accept(ModItems.RAWCUM);
                    }).build());

    public static final Supplier<CreativeModeTab> GOONCRAFT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("gooncraftblocktab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.HARDCUM.get()))
                    .title(Component.translatable("creativetab.nightmaregooncraft.gooncraftblocktab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.HARDCUM);
                        output.accept(ModBlocks.PRIDEFLAG);
                        output.accept(ModBlocks.HARDCUMORE);
                    }).build());


   public static void register(IEventBus eventBus) {
       CREATIVE_MODE_TAB.register(eventBus);
   }


}
