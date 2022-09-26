package Flights;

public enum Plane {
    BOEING777(2,100),

    BOEING747(3,100),
    BOEING737(1,100);

    private final int capacity;
    private final int totalWeight;

    Plane(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
