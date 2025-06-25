public class ProductMain {
    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 75000.0, 1);
        Product p2 = new Product(102, "Headphones", 1500.0, 2);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();

        System.out.println();
        Product.updateDiscount(15.0);

        System.out.println("After Updating Discount:\n");

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
    }
}
