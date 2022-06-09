package Assignment_3;

public class RtTriangle extends Shape {
	private double Side_A;
	private double Side_B;
	private double Side_C;
	
	public RtTriangle(int numSides, double Side_A, double Side_B, double Side_C) {
		super(numSides=3);
		this.Side_A=Side_A;
		this.Side_B=Side_B;
		this.Side_C=Side_A;
	}

	public double area() {
		double sqrt = (Side_A+Side_B+Side_C)/2;
		return Math.sqrt(sqrt*(sqrt-Side_A)*(sqrt-Side_B)*(sqrt-Side_C));
		
	}

	public double perimeter() {
		double perimeter=(Side_A*Side_B*Side_C)/2;		
		return perimeter;
	}

}
