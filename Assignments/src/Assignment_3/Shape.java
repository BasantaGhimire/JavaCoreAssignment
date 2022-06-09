package Assignment_3;

public abstract class Shape {
	//Datamembers:numsSides
	private int numSides;
	
	
	public abstract double area();
	public abstract double perimeter();
	
	
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		if(numSides==4) {
			System.out.println("Rectangle");
		}else if
			(numSides==3) {
			System.out.println("RtTriangle");
		}else {
			System.out.println("Circle");
			}
		this.numSides = numSides;
	}
	
	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}
	
}
