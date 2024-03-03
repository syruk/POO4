package LibraryManagement;

class Book extends Item {
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, "Book");
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
    }
}
