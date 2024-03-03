package LibraryManagement;

abstract class Item {
    protected String title;
    protected String type;

    public Item(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "Type: " + type + ", Title: " + title;
    }


    public abstract void displayDetails();
}
