package ITV2;

abstract class Transport {
    private String type;
    private long entryTime;

    public Transport(String type, long entryTime) {
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
