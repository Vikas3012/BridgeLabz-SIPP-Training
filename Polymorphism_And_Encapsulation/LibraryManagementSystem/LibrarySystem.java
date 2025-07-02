public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("B001", "Java Programming", "James Gosling");
        items[1] = new Magazine("M101", "Tech Weekly", "Various Authors");
        items[2] = new DVD("D501", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable res = (Reservable) item;
                System.out.println("Available: " + res.checkAvailability());
                res.reserveItem("John Doe");
                System.out.println("Available After Reservation: " + res.checkAvailability());
            } else {
                System.out.println("Item is not reservable.");
            }

            System.out.println("--------------------------");
        }
    }
}