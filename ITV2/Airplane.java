package ITV2;

class Airplane extends Transport {
    private String airline;
    private int passengerCapacity;

    public Airplane(String airline, int passengerCapacity, long entryTime) {
        super("Airplane", entryTime);
        this.airline = airline;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void inspection() {
        System.out.println("Airplane inspection - Airline: " + airline + ", Passenger Capacity: " + passengerCapacity);
    }
}
