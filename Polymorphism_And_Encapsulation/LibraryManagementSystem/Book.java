public class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (available) {
            setBorrower(borrowerName);
            available = false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}