package org.societies.bridge;

/**
 * Represents a WorldProvider
 */
public interface WorldResolver {

    World getWorld(String name);

    World getDefaultWorld();
}
