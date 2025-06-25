public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("25112","the real world","chappan lal");
        Book book1 =  new Book("234342","the hero","mani chand");

        book1.displayDetails();

        book.displayDetails();

        Book.displayLibraryName();
    }
}
