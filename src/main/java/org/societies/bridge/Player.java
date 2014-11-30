package org.societies.bridge;

import java.util.Locale;

/**
 * Represents a Player
 */
public interface Player {

    boolean isAvailable();

    double getHealth();

    int getFoodLevel();

    Location getLocation();

    World getWorld();

    boolean teleport(Location location);

    void sendBlockChange(Location location, Material material, byte b);

    Inventory getInventory();

    Locale getLocale();
}
