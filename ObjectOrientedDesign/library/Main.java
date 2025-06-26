package objectmodeling_relationships.library;

public class Main {
	public static void main(String[] args) {
        // Create independent Book objects
		Book book1 = new Book("book1" , "author1");
		Book book2 = new Book("book2" , "author2");
		Book book3 = new Book("book3" , "author3");
		
        // Create Library objects
		Library central = new Library("Central Library");
        Library communityLibrary = new Library("Community Library");
        
        // Aggregating books into libraries
        central.addBook(book1);
        central.addBook(book2);

        communityLibrary.addBook(book2);
        communityLibrary.addBook(book3);
        
        central.dispalyLibraryInfo();
        communityLibrary.dispalyLibraryInfo();
        
	}
}
