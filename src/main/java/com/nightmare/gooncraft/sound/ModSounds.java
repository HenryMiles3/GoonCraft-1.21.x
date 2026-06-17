package com.nightmare.gooncraft.sound;

import com.nightmare.gooncraft.GoonCraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, GoonCraft.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> FUNSOUND = SOUND_EVENTS.register("fun_sound",
            () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(GoonCraft.MOD_ID, "fun_sound")));
}
