public class Airplane {
    private final String model;
    private final int capacity;
    private final int range;
    public Airplane(String model, int capacity, int range) {
        this.model = model;
        this.capacity = capacity;
        this.range = range;
    }
    public int getCapacity() { return capacity; }
    public int getRange() { return range; }
    @Override
    public String toString() { return model + ", вместимость " + capacity + ", дальность " + range + " км"; }
}
