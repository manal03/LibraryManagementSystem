package library;

	abstract class LibraryItem{
		private String title;
		private int year; 
	
	public LibraryItem(String title, int year) {
		this.title = title; 
		this.year = year; 
	}
	
	public String getTitle(){
		return title; 
	}
	
	public int getYear(){
		return year; 
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	}

