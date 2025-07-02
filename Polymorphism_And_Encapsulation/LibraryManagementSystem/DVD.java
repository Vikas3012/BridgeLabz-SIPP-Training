public class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
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