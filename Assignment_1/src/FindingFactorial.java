import java.util.Scanner;

public class FindingFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	       System.out.print("Enter the number here: ");
	       int number= input.nextInt();
	       int factorial = 1;
	       int i = 1;
	       while(i<=number)
	       {
	           factorial = factorial * i;
	           i++;
	       }
	       System.out.println("Factorial of "+number+" is: "+factorial);

	}

}
