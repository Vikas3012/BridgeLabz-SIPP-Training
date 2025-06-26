package objectmodeling_relationships.ecommerce;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Order> orders;
	
	public Customer(String name) {
		this.name = name;
		this.orders = new ArrayList<>();
	}
	
	public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.hashCode());
    }

    public void viewOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayOrder();
        }
    }
}
