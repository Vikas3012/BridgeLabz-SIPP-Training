public class Product {

    static double discount = 10.0;

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID   : " + productID);
            System.out.println("Name         : " + productName);
            System.out.println("Price        : " + price);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Discount     : " + discount + "%");
        } else {
            System.out.println("Invalid object. Not a Product.");
        }
    }
}
