package objectmodeling_relationships.ecommerce;

import java.util.ArrayList;

public class Order {
	private int orderId;
	private ArrayList<Product> productList;
	
	public Order(int orderId) {
		this.orderId = orderId;
		this.productList = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public void displayOrder() {
		System.out.println("Order ID: " + orderId);
        System.out.println("Products in order:");
        double total = 0;
        for (Product p : productList) {
            p.displayProduct();
            total += p.getPrice();
        }
        System.out.println("Total Price: ₹" + total + "\n");
	}
	
}
