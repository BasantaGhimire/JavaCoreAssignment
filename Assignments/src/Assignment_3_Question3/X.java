package Assignment_3_Question3;


abstract class X {
	public X() {
		System.out.println("ONE");
	}
	abstract void abstractMethod();
}

class Y extends X {
	public Y() {
		System.out.println("TWO");
	}
	void abstractMethod() {
		System.out.println("THREE");
		}
}

