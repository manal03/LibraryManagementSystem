package library;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

	Library library = new Library();
    Scanner sc = new Scanner(System.in);

    boolean exit = false;
    while (!exit) {
        System.out.println("Select an option:");
        System.out.println("1. Add a new book");
        System.out.println("2. Add a new DVD");
        System.out.println("3. Display All Items");


        // ... other options ...

        int option = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the integer

        switch (option) {
            case 1:
                // Add a new book
                System.out.println("Enter the book title:");
                String title = sc.nextLine();
                int year = 0;
                try {
                    System.out.println("Enter the publication year:");
                    year = sc.nextInt();
                    sc.nextLine(); // Consume the newline character after reading the integer
                } catch (InputMismatchException e) {
                    sc.nextLine(); // Consume the invalid input to avoid an infinite loop
                    System.out.println("Invalid input for the publication year. Please enter an integer.");
                    continue; // Continue to the next iteration of the loop
                }
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
                 int dvdYear = 0;
             try {   
                 System.out.println("Enter the publication year:");
                 dvdYear = sc.nextInt();
                 sc.nextLine(); // Consume the newline character after reading the integer
             }catch (InputMismatchException e) {
                 sc.nextLine(); // Consume the invalid input to avoid an infinite loop
                 System.out.println("Invalid input for the publication year. Please enter an integer.");
                 continue; // Continue to the next iteration of the loop
             }
                 System.out.println("Enter the director:");
                 String director = sc.nextLine();
             
                 DVD newdvd = new DVD(dvdTitle, dvdYear, director);
                 library.addDVD(newdvd);
                 System.out.println("DVD added successfully.");
                 break;
            case 3: 
            	//Display all items
            	library.displayAllItems();
            	
            	break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    sc.close();
    System.out.println("Library management system exited.");
}
}







