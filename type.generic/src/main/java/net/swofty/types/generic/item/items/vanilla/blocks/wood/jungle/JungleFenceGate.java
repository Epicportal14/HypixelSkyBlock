package net.swofty.types.generic.item.items.vanilla.blocks.wood.jungle;

import net.swofty.types.generic.block.BlockType;
import net.swofty.types.generic.item.ItemTypeLinker;
import net.swofty.types.generic.item.ItemQuantifiable;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.DefaultCraftable;
import net.swofty.types.generic.item.impl.PlaceableCustomSkyBlockItem;
import net.swofty.types.generic.item.impl.Sellable;
import net.swofty.types.generic.item.impl.SkyBlockRecipe;
import net.swofty.types.generic.item.impl.recipes.ShapedRecipe;
import net.swofty.commons.statistics.ItemStatistics;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JungleFenceGate implements PlaceableCustomSkyBlockItem, DefaultCraftable, Sellable {
    @Override
    public SkyBlockRecipe<?> getRecipe() {
        Map<Character, ItemQuantifiable> ingredientMap = new HashMap<>();
        ingredientMap.put('A', new ItemQuantifiable(ItemTypeLinker.STICK, 1));
        ingredientMap.put('B', new ItemQuantifiable(ItemTypeLinker.JUNGLE_PLANKS, 1));
        List<String> pattern = List.of(
                "ABA",
                "ABA");
        return new ShapedRecipe(SkyBlockRecipe.RecipeType.NONE, new SkyBlockItem(ItemTypeLinker.JUNGLE_FENCE_GATE), ingredientMap, pattern);
    }

    @Override
    public ItemStatistics getStatistics(SkyBlockItem instance) {
        return ItemStatistics.empty();
    }

    @Override
    public @Nullable BlockType getAssociatedBlockType() {
        return null;
    }

    @Override
    public double getSellValue() {
        return 1;
    }
}
