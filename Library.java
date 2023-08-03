package library;

import java.util.ArrayList;
import java.util.List;

import library.LibraryItem.MediaType;

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
	 public List<LibraryItem> getAllItems() {
	        List<LibraryItem> allItems = new ArrayList<>();
	        allItems.addAll(books);
	        allItems.addAll(dvds);
	        return allItems;
	    }
	 public void displayAllItems() {
		    List<LibraryItem> allItems = getAllItems();

		 System.out.println("List of all items in the library:\n");

		    for (LibraryItem item : allItems) {
		        MediaType mediaType = item.getMediaType();
		        String type = (mediaType == MediaType.BOOK) ? "Book" : "DVD";
		        if (item instanceof Book) {
		            System.out.println(type + ": " + item.getTitle() + " - " + ((Book) item).getAuthor() + " (" + item.getYear() + ")");
		        } else if (item instanceof DVD) {
		            System.out.println(type + ": " + item.getTitle() + " - " + ((DVD) item).getDirector() + " (" + item.getYear() + ")");
		        } else {
		            System.out.println("Unknown item type.");
		        }
		    }

	
	
	
	
	
	
	
	 }	
}
