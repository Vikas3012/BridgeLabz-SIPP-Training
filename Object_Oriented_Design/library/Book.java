package objectmodeling_relationships.library;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void display() {
		System.out.println("Title: " + title + " and its author " + author);
	}
}
