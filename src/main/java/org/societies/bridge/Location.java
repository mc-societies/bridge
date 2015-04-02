package org.societies.bridge;

/**
 * Represents a Location
 */
public class Location extends Vector3d {

    private final World world;
    private final float pitch, yaw, roll;

    public Location(World world, Vector3d vector) {
        this(world, vector.getX(), vector.getY(), vector.getZ(), 0, 0, 0);
    }

    public Location(World world, double x, double y, double z) {
        this(world, x, y, z, 0, 0, 0);
    }

    public Location(World world, double x, double y, double z, float pitch, float yaw, float roll) {
        super(x, y, z);
        this.world = world;
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
    }

    public float getPitch() {
        return pitch;
    }

    public float getYaw() {
        return yaw;
    }

    public float getRoll() {
        return roll;
    }

    public World getWorld() {
        return world;
    }

    @Override
    public Location add(double x, double y, double z) {
        return new Location(getWorld(), super.add(x, y, z));
    }

    @Override
    public Location floor() {
        return new Location(getWorld(), getRoundedX(), getRoundedY(), getRoundedZ());
    }

    public static class InvalidLocation extends Location {

        public InvalidLocation() {
            super(null, 0, 0, 0);
        }
    }
}
