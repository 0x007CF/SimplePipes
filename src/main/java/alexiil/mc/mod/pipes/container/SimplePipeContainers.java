package alexiil.mc.mod.pipes.container;

import net.fabricmc.fabric.api.container.ContainerFactory;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;

import net.minecraft.container.Container;
import net.minecraft.util.Identifier;

import alexiil.mc.mod.pipes.SimplePipes;

public class SimplePipeContainers {
    public static final Identifier TRIGGER_ITEM_INV_SPACE = id("trigger_item_inv_space");
    public static final Identifier TRIGGER_ITEM_INV_CONTAINS = id("trigger_item_inv_contains");

    private static Identifier id(String name) {
        return new Identifier(SimplePipes.MODID, name);
    }

    public static void load() {
        register(TRIGGER_ITEM_INV_SPACE, ContainerTriggerInvSpace.FACTORY);
        register(TRIGGER_ITEM_INV_CONTAINS, ContainerTriggerInvContains.FACTORY);
    }

    private static void register(Identifier id, ContainerFactory<Container> factory) {
        ContainerProviderRegistry.INSTANCE.registerFactory(id, factory);
    }
}