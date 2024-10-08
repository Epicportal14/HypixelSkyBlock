package net.swofty.types.generic.item.items.combat.slayer.wolf.craftable;

import net.swofty.types.generic.gems.Gemstone;
import net.swofty.types.generic.item.ItemTypeLinker;
import net.swofty.types.generic.item.ItemQuantifiable;
import net.swofty.types.generic.item.SkyBlockItem;
import net.swofty.types.generic.item.impl.*;
import net.swofty.types.generic.item.impl.recipes.ShapedRecipe;
import net.swofty.types.generic.user.SkyBlockPlayer;
import net.swofty.commons.statistics.ItemStatistic;
import net.swofty.commons.statistics.ItemStatistics;

import java.util.*;
import net.swofty.commons.item.ItemType;

public class PoochSword implements CustomSkyBlockItem, DefaultCraftable, StandardItem, GemstoneItem, NotFinishedYet {
    @Override
    public SkyBlockRecipe<?> getRecipe() {
        Map<Character, ItemQuantifiable> ingredientMap = new HashMap<>();
        ingredientMap.put('A', new ItemQuantifiable(ItemTypeLinker.GOLDEN_TOOTH, 24));
        ingredientMap.put('B', new ItemQuantifiable(ItemTypeLinker.SHAMAN_SWORD, 1));
        ingredientMap.put(' ', new ItemQuantifiable(ItemType.AIR, 1));
        List<String> pattern = List.of(
                " A ",
                " A ",
                " B ");

        return new ShapedRecipe(SkyBlockRecipe.RecipeType.SVEN_PACKMASTER, new SkyBlockItem(ItemTypeLinker.POOCH_SWORD), ingredientMap, pattern);
    }

    @Override
    public ItemStatistics getStatistics(SkyBlockItem instance) {
        return ItemStatistics.builder()
                .withBase(ItemStatistic.DAMAGE, 120D)
                .withBase(ItemStatistic.STRENGTH, 20D)
                .withBase(ItemStatistic.SPEED, 5D)
                .build();
    }

    @Override
    public ArrayList<String> getLore(SkyBlockPlayer player, SkyBlockItem item) {
        return new ArrayList<>(Arrays.asList(
                "§7Deal §c+1 Damage §7per §c50 max ❤§7.",
                "§7Receive §a-20% §7damage from wolves.",
                "§7Gain §c+150❁ Strength §7against wolves."));
    }

    @Override
    public List<GemstoneItemSlot> getGemstoneSlots() {
        return List.of(
                new GemstoneItemSlot(Gemstone.Slots.JASPER, 50000)
        );
    }

    @Override
    public StandardItemType getStandardItemType() {
        return StandardItemType.SWORD;
    }
}
