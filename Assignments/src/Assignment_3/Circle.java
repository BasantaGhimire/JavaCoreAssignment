package Assignment_3;

public class Circle extends Shape {
	private final double radius;
	 double PI = Math.PI;
	 
	 public Circle(int numSides, double radius) {
		 super(numSides=1);
		 this.radius = radius; }		 

		// Area = π r^2
	    public double area() {	        
	        return PI * Math.pow(radius, 2);
	    }

	    // Perimeter = 2πr
	    public double perimeter() {	       
	        return 2 * PI * radius;
	    }

}
