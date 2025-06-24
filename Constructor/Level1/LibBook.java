public class LibBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public LibBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    // Borrow method
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        } else {
            return false;
        }
    }

    public void displayStatus() {
        System.out.println(title + " by " + author + " - " + (isAvailable ? "Available" : "Not Available"));
    }
}
