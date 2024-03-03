package ITV2;

class Boat extends Transport {
    private String name;
    private int length;

    public Boat(String name, int length, long entryTime) {
        super("Boat", entryTime);
        this.name = name;
        this.length = length;
    }

    @Override
    public void inspection() {
        System.out.println("Boat inspection - Name: " + name + ", Length: " + length);
    }
}
