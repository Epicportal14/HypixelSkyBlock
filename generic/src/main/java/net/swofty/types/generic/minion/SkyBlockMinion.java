package net.swofty.types.generic.minion;

import lombok.Getter;
import net.minestom.server.color.Color;
import net.minestom.server.item.Material;

import java.util.List;

public abstract class SkyBlockMinion {
    public abstract List<MinionTier> getTiers();
    public abstract Color getBootColour();
    public abstract Color getLeggingsColour();
    public abstract Color getChestplateColour();
    public abstract String getTexture();
    public abstract Material getHeldItem();


    public record MinionTier(int tier, int timeBetweenActions, int storage) {
        public int getSlots() {
            return storage / 64;
        }
    }
}
