package LibraryManagement;

class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title, "Magazine");
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Issue Number: " + issueNumber);
    }
}
