package Assignment_3;

public class Rectangle extends Shape{
	
	private double width;
	private double height;
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		
		if (width>0) {
			this.width = width;
		}else System.out.println("Invalid input: "+width);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height>0) {
			this.height = height;
		}else System.out.println("Invalid input: "+height);
	}

	public Rectangle(int numSides, double width, double height) {
		super(numSides=1);
		this.width=width;
		this.height=height;
	}

	public double area() { 
		return width*height; //area=width*height;
	}

	public double perimeter() {
		return 2*(width+height);// perimeter=2*(width+height);
	}

	public static void resize(Object r, double d) {
		// TODO Auto-generated method stub
		
	}

}
