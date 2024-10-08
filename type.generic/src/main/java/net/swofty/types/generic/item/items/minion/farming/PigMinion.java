package net.swofty.types.generic.item.items.minion.farming;

import net.swofty.types.generic.item.ItemTypeLinker;
import net.swofty.types.generic.item.impl.CustomSkyBlockItem;
import net.swofty.types.generic.item.impl.Minion;
import net.swofty.types.generic.minion.MinionIngredient;
import net.swofty.types.generic.minion.MinionRegistry;

import java.util.List;

public class PigMinion implements CustomSkyBlockItem, Minion {
    @Override
    public MinionRegistry getMinionRegistry() {
        return MinionRegistry.PIG;
    }

    @Override
    public ItemTypeLinker getFirstBaseItem() {
        return ItemTypeLinker.WOODEN_SWORD;
    }

    @Override
    public boolean isByDefaultCraftable() {
        return false;
    }

    @Override
    public List<MinionIngredient> getMinionCraftingIngredients() {
        return List.of(
                new MinionIngredient(ItemTypeLinker.PORKCHOP, 8),
                new MinionIngredient(ItemTypeLinker.PORKCHOP, 16),
                new MinionIngredient(ItemTypeLinker.PORKCHOP, 32),
                new MinionIngredient(ItemTypeLinker.PORKCHOP, 64),
                new MinionIngredient(ItemTypeLinker.ENCHANTED_PORK, 1),
                new MinionIngredient(ItemTypeLinker.ENCHANTED_PORK, 3),
                new MinionIngredient(ItemTypeLinker.ENCHANTED_PORK, 8),
                new MinionIngredient(ItemTypeLinker.ENCHANTED_PORK, 16),
                new MinionIngredient(ItemTypeLinker.ENCHANTED_PORK, 32),
                new MinionIngredient(ItemTypeLinker.ENCHANTED_PORK, 64),
                new MinionIngredient(ItemTypeLinker.ENCHANTED_GRILLED_PORK, 1)
        );
    }
}
