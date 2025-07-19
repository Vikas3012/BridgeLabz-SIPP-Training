
class BookNode {
    String title, author, genre;
    int bookId;
    boolean available;
    BookNode next, prev;

    BookNode(String title, String author, String genre, int bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
    }
}

public class LibraryManagementSystem {
    private BookNode head, tail;

    public void addAtEnd(String title, String author, String genre, int bookId, boolean available) {
        BookNode newNode = new BookNode(title, author, genre, bookId, available);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeByBookId(int bookId) {
        BookNode curr = head;
        while (curr != null) {
            if (curr.bookId == bookId) {
                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
                else tail = curr.prev;
                return;
            }
            curr = curr.next;
        }
    }

    public void updateAvailability(int bookId, boolean status) {
        BookNode curr = head;
        while (curr != null) {
            if (curr.bookId == bookId) {
                curr.available = status;
                return;
            }
            curr = curr.next;
        }
    }

    public void displayForward() {
        BookNode curr = head;
        while (curr != null) {
            System.out.println(curr.title + " by " + curr.author + " | Genre: " + curr.genre + " | Available: " + curr.available);
            curr = curr.next;
        }
    }
    public void displayBackward() {
        BookNode curr = tail;
        while (curr != null) {
            System.out.println(curr.title + " by " + curr.author + " | Genre: " + curr.genre + " | Available: " + curr.available);
            curr = curr.prev;
        }
    }

    public int countBooks() {
        int count = 0;
        BookNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();
        lib.addAtEnd("Book A", "Author X", "Fiction", 1001, true);
        lib.addAtEnd("Book B", "Author Y", "Sci-fi", 1002, false);
        lib.displayForward();
        System.out.println("Total Books: " + lib.countBooks());
    }
}