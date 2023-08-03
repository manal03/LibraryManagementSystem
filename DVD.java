package library;

import library.LibraryItem.MediaType;

public class DVD extends LibraryItem{
		private String director; 
	    private MediaType mediaType = MediaType.DVD;

		public DVD(String title, int year, String director) {
			super(title,year); //Super function will call abstract class now
			this.director = director; //New object is created now
		}
		public String getDirector() {
			return director; 
		}
		public void setAuthor(String director) {
			this.director = director;
		}	
		 public MediaType getMediaType() {
		        return mediaType;
		    }
	}
