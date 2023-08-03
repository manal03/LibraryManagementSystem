package library;

	public class Book extends LibraryItem{
		private String author; 
	    private MediaType mediaType = MediaType.BOOK;

		
		public Book(String title, int year, String author) {
			super(title,year); //Super function will call abstract class now
			this.author = author; //New object is created now
		}
		public String getAuthor() {
			return author; 
		}
		public void setAuthor(String author) {
			this.author = author;
		}	
		 public MediaType getMediaType() {
		        return mediaType;
		    }
	}

	
