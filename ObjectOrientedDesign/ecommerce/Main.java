package objectmodeling_relationships.ecommerce;

public class Main {
	public static void main(String[] args) {
		// Create some products
        Product p1 = new Product("Smartphone", 15000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Power Bank", 1200);

        // Create customer
        Customer john = new Customer("John Doe");

        // Create order and add products
        Order order1 = new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p2);

        // Another order
        Order order2 = new Order(1002);
        order2.addProduct(p3);

        // Customer places orders
        john.placeOrder(order1);
        john.placeOrder(order2);

        // View customer orders
        john.viewOrders();
	}
}
