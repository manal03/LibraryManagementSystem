package library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;
	private ArrayList<DVD> dvds; 
	public Library() {
		books = new ArrayList<>();
		dvds = new ArrayList<>();
	}
	 public void addBook(Book book) {
	        books.add(book);
	    }
	 public void addDVD(DVD dvd) {
	        dvds.add(dvd);
	    }
	 public void displayAllItems() {
		 if(books.isEmpty()) {
		    System.out.println("No books are checked out.");
			 
		 }else {
	        System.out.println("List of all books:\n");
	    for (Book book : books) {
	            System.out.println(book.getTitle() + " - " + book.getAuthor() + " (" + book.getYear() + ")\n");
	    }
		 }
	    if(dvds.isEmpty()) {
		    System.out.println("No DVDs are checked out.\n");
			 
		 }else {
	        System.out.println("\nList of all DVDs:\n");
	     for (DVD dvd : dvds) {
	            System.out.println(dvd.getTitle() + " - " + dvd.getDirector() + " (" + dvd.getYear() + ")\n");
	    }
		 }

	
	
	
	
	
	
	
	 }	
}
