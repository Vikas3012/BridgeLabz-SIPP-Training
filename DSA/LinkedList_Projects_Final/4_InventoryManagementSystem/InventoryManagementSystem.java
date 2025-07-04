
class ItemNode {
    String itemName;
    int itemId, quantity;
    double price;
    ItemNode next;

    ItemNode(String name, int id, int qty, double price) {
        this.itemName = name;
        this.itemId = id;
        this.quantity = qty;
        this.price = price;
    }
}

public class InventoryManagementSystem {
    private ItemNode head;

    public void addAtEnd(String name, int id, int qty, double price) {
        ItemNode newNode = new ItemNode(name, id, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void display() {
        ItemNode temp = head;
        double totalValue = 0;
        while (temp != null) {
            double value = temp.quantity * temp.price;
            System.out.println(temp.itemName + " | Qty: " + temp.quantity + " | Price: " + temp.price + " | Value: " + value);
            totalValue += value;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + totalValue);
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addAtEnd("Laptop", 101, 5, 50000);
        ims.addAtEnd("Mouse", 102, 10, 500);
        ims.display();
    }
}
