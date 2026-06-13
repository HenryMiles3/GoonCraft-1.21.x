package com.nightmare.gooncraft.item;

import com.nightmare.gooncraft.GoonCraft;
import com.nightmare.gooncraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GoonCraft.MOD_ID);

    public static final Supplier<CreativeModeTab> GOONCRAFT_TAB = CREATIVE_MODE_TAB.register("gooncrafttab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CUMBUCKET.get()))
                    .title(Component.translatable("creativetab.nightmaregooncraft.gooncrafttab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Items
                        output.accept(ModItems.CUMBUCKET);
                        output.accept(ModItems.TYRONEBUCKET);
                        output.accept(ModItems.RAWCUM);

                        //Blocks
                        output.accept(ModBlocks.HARDCUM);
                        output.accept(ModBlocks.PRIDEFLAG);
                        output.accept(ModBlocks.HARDCUMORE);

                    }).build());


   public static void register(IEventBus eventBus) {
       CREATIVE_MODE_TAB.register(eventBus);
   }


}
