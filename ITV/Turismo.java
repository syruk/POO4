package ITV;

class Turismo extends Vehicle {
    private String brand;
    private String model;

    public Turismo(String brand, String model, long entryTime) {
        super("Turismo", entryTime);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void inspection() {
        System.out.println("Turismo inspection - Brand: " + brand + ", Model: " + model);
    }
}
