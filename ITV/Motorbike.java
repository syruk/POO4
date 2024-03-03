package ITV;

class Motorbike extends Vehicle {
    private String brand;
    private boolean electric;

    public Motorbike(String brand, boolean electric, long entryTime) {
        super("Motorbike", entryTime);
        this.brand = brand;
        this.electric = electric;
    }

    @Override
    public void inspection() {
        System.out.println("Motorbike inspection - Brand: " + brand + ", Electric: " + (electric ? "Yes" : "No"));
    }
}
