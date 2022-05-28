package Assignment_3;

public class Rectangle extends Shape{
	
	private final double area, perimeter;
	
	public Rectangle(int numSides, double width, double length) {
		super(numSides=4);
		this.area = width*length;
		this.perimeter = 2*(width+length);
	}

	public double area() {
		return this.area;
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		return this.perimeter;
	}

}
