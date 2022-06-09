package Assignment_3;

public class Test {

	private static Object r;

	public static void main(String[] args) {
		
		//Rectangle
		
		  double width=2; double height=3;
		 
		
		Rectangle Rectangle1=new Rectangle(4, width, height);
		Rectangle1.setWidth(1);
		Rectangle1.setHeight(5);
		
		System.out.println("Rectangle width: " + Rectangle1.getWidth() + " and height: " + Rectangle1.getHeight()
                + "\narea is: " + Rectangle1.area()
                + "\nperimeter is: " + Rectangle1.perimeter() + "\n");
		
		
	
		//Object r;
		Rectangle.resize(r,2.0);
	    System.out.println("width = " + Rectangle1.getWidth() + " height = "
	            + Rectangle1.getHeight()
	            + "\narea is: " + Rectangle1.area()
                + "\nperimeter is: " + Rectangle1.perimeter() + "\n");
	    		
	    
		
		//RtTriangle
        double Side_A = 5;
        double Side_B = 3;
        double Side_C = 4;
        
        Shape RtTriangle = new RtTriangle(3, Side_A, Side_B, Side_C);
        System.out.println("Triangle sides lengths: " + Side_A + ", " + Side_A + ", " + Side_A
                + "\nArea is: " + RtTriangle.area()
                + "\nPerimeter is: " + RtTriangle.perimeter() + "\n");

        //circle
        double radius = 5;
        Shape circle = new Circle(0, radius);
        System.out.println("Circle radius: " + radius
            + "\nArea is: " + circle.area()
            + "\nPerimeter is: " + circle.perimeter() + "\n");
    }
	

}
