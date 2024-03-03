package ITV;

class Truck extends Vehicle {
    private String brand;
    private int maxLoad;

    public Truck(String brand, int maxLoad, long entryTime) {
        super("Truck", entryTime);
        this.brand = brand;
        this.maxLoad = maxLoad;
    }
    @Override
    public void inspection() {
        System.out.println("Truck inspection - Brand: " + brand + ", Max Load: " + maxLoad);
    }
}