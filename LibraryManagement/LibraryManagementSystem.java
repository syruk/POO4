package LibraryManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static ArrayList<Item> libraryItems = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    searchItem();
                    break;
                case 3:
                    deleteItem();
                    break;
                case 4:
                    displayLibrary();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }


    private static void displayMenu() {
        System.out.println("\nLibrary Management System Menu:");
        System.out.println("1. Add Item");
        System.out.println("2. Search Item");
        System.out.println("3. Delete Item");
        System.out.println("4. Display Library");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }


    private static void addItem() {
        System.out.print("Enter the title of the item: ");
        String title = scanner.nextLine();
        System.out.print("Enter the type of the item (Book, Magazine, DVD): ");
        String type = scanner.nextLine();

        switch (type.toLowerCase()) {
            case "book":
                System.out.print("Enter the author of the book: ");
                String author = scanner.nextLine();
                System.out.print("Enter the page count of the book: ");
                int pageCount = scanner.nextInt();
                libraryItems.add(new Book(title, author, pageCount));
                break;
            case "magazine":
                System.out.print("Enter the issue number of the magazine: ");
                int issueNumber = scanner.nextInt();
                libraryItems.add(new Magazine(title, issueNumber));
                break;
            case "dvd":
                System.out.print("Enter the director of the DVD: ");
                String director = scanner.nextLine();
                System.out.print("Enter the duration of the DVD (in minutes): ");
                int durationMinutes = scanner.nextInt();
                libraryItems.add(new DVD(title, director, durationMinutes));
                break;
            default:
                System.out.println("Invalid item type.");
                break;
        }
        System.out.println("Item added successfully!");
    }


    private static void searchItem() {
        System.out.print("Enter the title of the item to search: ");
        String searchTitle = scanner.nextLine();
        boolean found = false;
        for (Item item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Item found: " + item);
                item.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in the library.");
        }
    }


    private static void deleteItem() {
        System.out.print("Enter the title of the item to delete: ");
        String deleteTitle = scanner.nextLine();
        boolean removed = false;
        for (Item item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(deleteTitle)) {
                libraryItems.remove(item);
                System.out.println("Item deleted successfully!");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item not found in the library.");
        }
    }


    private static void displayLibrary() {
        System.out.println("\nLibrary Items:");
        if (libraryItems.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            for (Item item : libraryItems) {
                System.out.println(item);
            }
        }
    }
}

