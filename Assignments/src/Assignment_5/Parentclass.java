package Assignment_5;

public class Parentclass {
	//Overridden method
	   void display(){
		System.out.println("This is parent class method");
	   }
	}

	//Complete following class:

class Subclass extends Parentclass{
	void display(){
		System.out.println("Child class method");
		}
	void printMsg(){
		display();
		}
	}
class Main{
	public static void main(String args[]){
		Subclass subclass1=new Subclass();
		subclass1.printMsg();
		}
	}
