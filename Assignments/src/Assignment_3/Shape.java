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
		this.numSides = numSides;
	}
	
	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}

}
