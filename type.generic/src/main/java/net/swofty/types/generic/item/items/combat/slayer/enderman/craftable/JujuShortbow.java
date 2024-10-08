package net.swofty.types.generic.item.items.combat.slayer.enderman.craftable;

import net.minestom.server.coordinate.Vec;
import net.swofty.types.generic.entity.ArrowEntityImpl;
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

public class JujuShortbow implements CustomSkyBlockItem, DefaultCraftable, BowImpl, NotFinishedYet {
    @Override
    public SkyBlockRecipe<?> getRecipe() {
        Map<Character, ItemQuantifiable> ingredientMap = new HashMap<>();
        ingredientMap.put('A', new ItemQuantifiable(ItemTypeLinker.ENCHANTED_EYE_OF_ENDER, 32));
        ingredientMap.put('B', new ItemQuantifiable(ItemTypeLinker.ENCHANTED_STRING, 64));
        ingredientMap.put('C', new ItemQuantifiable(ItemTypeLinker.NULL_OVOID, 32));
        ingredientMap.put('D', new ItemQuantifiable(ItemTypeLinker.ENCHANTED_QUARTZ_BLOCK, 32));
        ingredientMap.put(' ', new ItemQuantifiable(ItemType.AIR, 1));
        List<String> pattern = List.of(
                " AB",
                "C B",
                " DB");

        return new ShapedRecipe(SkyBlockRecipe.RecipeType.VOIDGLOOM_SERAPH, new SkyBlockItem(ItemTypeLinker.JUJU_SHORTBOW), ingredientMap, pattern);
    }

    @Override
    public ItemStatistics getStatistics(SkyBlockItem instance) {
        return ItemStatistics.builder()
                .withBase(ItemStatistic.DAMAGE, 310D)
                .withBase(ItemStatistic.STRENGTH, 40D)
                .withBase(ItemStatistic.CRIT_CHANCE, 10D)
                .withBase(ItemStatistic.CRIT_DAMAGE, 110D)
                .build();
    }

    @Override
    public ArrayList<String> getLore(SkyBlockPlayer player, SkyBlockItem item) {
        return new ArrayList<>(Arrays.asList(
                "§7Hits §c3 §7mobs on impact.",
                "§7Can damage endermen.",
                "",
                "§5Shortbow: Instantly shoots!"));
    }

    @Override
    public boolean shouldBeArrow() {
        return false;
    }

    @Override
    public void onBowShoot(SkyBlockPlayer player, SkyBlockItem item) {
        SkyBlockItem arrow = player.getAndConsumeArrow();
        if (arrow == null) return;

        ArrowEntityImpl arrowEntity = new ArrowEntityImpl(player, item);
        Vec arrowVelocity = calculateArrowVelocity(
                player.getPosition().pitch(),
                player.getPosition().yaw());
        arrowEntity.setVelocity(arrowVelocity);
        arrowEntity.setInstance(player.getInstance(), calculateArrowSpawnPosition(player));
    }
}
