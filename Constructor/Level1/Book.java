class Book{
	private String title;
	private String author;
	private double price;

	public Book(){
		this.title="unknown";
		this.author="unknown";
		this.price=0.0;	
	}

	public Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}

	public String getTitle(){return title;}
	public String getAuthor(){return author;}
	public double getPrice(){return price;}

	public static void main(String[] args) {
        // Using default constructor
        	Book defaultBook = new Book();
        	System.out.println("Default Book:");
        	System.out.println("Title: " + defaultBook.getTitle());
        	System.out.println("Author: " + defaultBook.getAuthor());
        	System.out.println("Price: " + defaultBook.getPrice());

        // Using parameterized constructor
        	Book customBook = new Book("The Alchemist", "Paulo Coelho", 399.0);
        	System.out.println("\nCustom Book:");
        	System.out.println("Title: " + customBook.getTitle());
        	System.out.println("Author: " + customBook.getAuthor());
        	System.out.println("Price: " + customBook.getPrice());
	}
}