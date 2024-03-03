package ITV2;

class Car extends Transport {
    private String brand;
    private String model;

    public Car(String brand, String model, long entryTime) {
        super("Car", entryTime);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void inspection() {
        System.out.println("Car inspection - Brand: " + brand + ", Model: " + model);
    }
}