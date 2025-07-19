
class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieManagementSystem {
    private MovieNode head, tail;

    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeByTitle(String title) {
        MovieNode curr = head;
        while (curr != null) {
            if (curr.title.equals(title)) {
                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
                else tail = curr.prev;
                return;
            }
            curr = curr.next;
        }
    }

    public void searchByDirector(String director) {
        MovieNode curr = head;
        while (curr != null) {
            if (curr.director.equals(director))
                System.out.println("Found: " + curr.title + " (" + curr.year + ")");
            curr = curr.next;
        }
    }

    public void updateRating(String title, double newRating) {
        MovieNode curr = head;
        while (curr != null) {
            if (curr.title.equals(title)) {
                curr.rating = newRating;
                return;
            }
            curr = curr.next;
        }
    }

    public void displayForward() {
        MovieNode curr = head;
        while (curr != null) {
            System.out.println(curr.title + " by " + curr.director + " (" + curr.year + ") - Rating: " + curr.rating);
            curr = curr.next;
        }
    }

    public void displayBackward() {
        MovieNode curr = tail;
        while (curr != null) {
            System.out.println(curr.title + " by " + curr.director + " (" + curr.year + ") - Rating: " + curr.rating);
            curr = curr.prev;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem system = new MovieManagementSystem();
        system.addAtEnd("Inception", "Nolan", 2010, 8.8);
        system.addAtEnd("Interstellar", "Nolan", 2014, 9.0);
        system.displayForward();
    }
}
