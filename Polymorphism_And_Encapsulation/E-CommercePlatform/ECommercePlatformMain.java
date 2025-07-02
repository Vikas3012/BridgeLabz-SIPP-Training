public class ECommercePlatformMain {
    public static void main(String[] args) {
        Product[] products = new Product[4];

        products[0] = new Electronics(101, "Smartphone", 30000);
        products[1] = new Clothing(102, "Jacket", 2000);
        products[2] = new Groceries(103, "Rice", 500);
        products[3] = new Electronics(104, "Laptop", 70000);

        for (Product p : products) {
            double price = p.getPrice();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double finalPrice = price + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Price: ₹" + price);
            System.out.println("Discount: ₹" + discount);
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("------------------------");
        }
    }
}
