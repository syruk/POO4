package LibraryManagement;

class DVD extends Item {
    private String director;
    private int durationMinutes;

    public DVD(String title, String director, int durationMinutes) {
        super(title, "DVD");
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Duration (minutes): " + durationMinutes);
    }
}
