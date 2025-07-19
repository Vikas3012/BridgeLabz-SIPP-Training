class TicketNode {
    int ticketId;
    String customerName, movieName;
    String seatNumber, bookingTime;
    TicketNode next;

    TicketNode(int id, String cname, String mname, String seat, String time) {
        this.ticketId = id;
        this.customerName = cname;
        this.movieName = mname;
        this.seatNumber = seat;
        this.bookingTime = time;
    }
}

public class OnlineTicketReservationSystem {
    private TicketNode head = null;

    public void addAtEnd(int id, String cname, String mname, String seat, String time) {
        TicketNode newNode = new TicketNode(id, cname, mname, seat, time);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println("Ticket: " + temp.ticketId + " | " + temp.customerName + " | " + temp.movieName + " | " + temp.seatNumber);
            temp = temp.next;
        } while (temp != head);
    }

    public int countTickets() {
        if (head == null) return 0;
        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        OnlineTicketReservationSystem system = new OnlineTicketReservationSystem();
        system.addAtEnd(1, "John", "Matrix", "A1", "10:00 AM");
        system.addAtEnd(2, "Jane", "Matrix", "A2", "10:01 AM");
        system.display();
        System.out.println("Total Tickets: " + system.countTickets());
    }
}