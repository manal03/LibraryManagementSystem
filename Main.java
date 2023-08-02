package library;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

	Library library = new Library();
    Scanner sc = new Scanner(System.in);

    boolean exit = false;
    while (!exit) {
        System.out.println("Select an option:");
        System.out.println("1. Add a new book");
        // ... other options ...

        int option = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the integer

        switch (option) {
            case 1:
                // Add a new book
                System.out.println("Enter the book title:");
                String title = sc.nextLine();
                System.out.println("Enter the publication year:");
                int year = sc.nextInt();
                sc.nextLine(); // Consume the newline character after reading the integer
                System.out.println("Enter the author:");
                String author = sc.nextLine();

                Book newBook = new Book(title, year, author);
                library.addBook(newBook);
                System.out.println("Book added successfully.");
                break;
            case 2: 
            	// Add a new DVD
            	 System.out.println("Enter the title:");
                 String dvdTitle = sc.nextLine();
                 System.out.println("Enter the publication year:");
                 int dvdYear = sc.nextInt();
                 sc.nextLine(); // Consume the newline character after reading the integer
                 System.out.println("Enter the author:");
                 String dvdDirector = sc.nextLine();

                 DVD newdvd = new DVD(title, year, director);
                 library.addDVD(newdvd);
                 System.out.println("Book added successfully.");

            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    sc.close();
    System.out.println("Library management system exited.");
}
}







