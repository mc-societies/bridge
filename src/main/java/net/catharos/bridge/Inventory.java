package net.catharos.bridge;

/**
 * Represents a Inventory
 */
public interface Inventory {

    ItemStack[] getContents();

    void remove(ItemStack itemStack);

    ItemStack getHelmet();

    ItemStack getLeggings();

    ItemStack getChestplate();

    ItemStack getBoots();

}
