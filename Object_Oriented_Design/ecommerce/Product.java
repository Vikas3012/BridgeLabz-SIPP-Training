package objectmodeling_relationships.ecommerce;

public class Product {
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	
	public void displayProduct() {
		System.out.println("Product Name: " + name + ", Price: " + price );
	}
}
