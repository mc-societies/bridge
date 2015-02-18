package org.societies.bridge;

/**
 * Represents a Scheduler
 */
public interface Scheduler {

    void scheduleSyncRepeatingTask(Runnable task, long period);
}
