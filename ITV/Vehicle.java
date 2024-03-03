package ITV;

abstract class Vehicle {
    private String type;
    private long entryTime;

    public Vehicle(String type, long entryTime) {
        this.type = type;
        this.entryTime = entryTime;
    }

    public String getType() {
        return type;
    }

    public long getEntryTime() {
        return entryTime;
    }
    public abstract void inspection();
}
