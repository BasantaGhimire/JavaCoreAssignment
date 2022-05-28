package Assignment_3;

public class Test {

	public static void main(String[] args) {
		
		//Rectangle
		double width=2;
		double length=3;
		
		Shape rectangle=new Rectangle(4, width, length);
		System.out.println("Rectangle width: " + width + " and length: " + length
                + "\narea is: " + rectangle.area()
                + "\nperimeter is: " + rectangle.perimeter() + "\n");
	}

}
