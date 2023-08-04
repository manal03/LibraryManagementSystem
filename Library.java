package library;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends LibraryItem> {
    private ArrayList<T> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getAllItems() {
        return items;
    }

    public void displayAllItems() {
        System.out.println("List of all items in the library:\n");

        for (T item : items) {
            String type = item.getMediaType() == LibraryItem.MediaType.BOOK ? "Book" : "DVD";
            String details = item instanceof Book
                    ? ((Book) item).getAuthor()
                    : (item instanceof DVD ? ((DVD) item).getDirector() : "Unknown");
            
            System.out.println(type + ": " + item.getTitle() + " - " + details + " (" + item.getYear() + ")");
        }
        System.out.println("\n");
    }
}
