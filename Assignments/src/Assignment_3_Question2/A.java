package Assignment_3_Question2;

abstract class A {
	abstract void firstMethod();
	
	void secondMethod() {
		System.out.println("second");
		firstMethod();		
	}
}
abstract class B extends A {
	void firstMethod() {
		System.out.println("FIRST");
		thirdMethod();
		}
	abstract void thirdMethod();
	}
class C extends B{
	void thirdMethod()
	{
		System.out.println("THIRD");
	}
}

