class Circle{
	private double radius;

	public Circle() {
        	this(1.0); // Calls parameterized constructor with default radius 1.0
    	}

    // Parameterized constructor
    	public Circle(double radius) {
        	this.radius = radius; // Initializes radius with given value
    	}

    // Getter method
    	public double getRadius() {
    	    return radius;
    	}

    // Method to calculate area
    	public double getArea() {
    	    return Math.PI * radius * radius;
    	}
}