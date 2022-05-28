package Assignment_1;
import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assignment_1 Sum of natural number");
	       Scanner input= new Scanner(System.in);
	       System.out.print("Enter the value of n: ");
	       int num= input.nextInt();
	       int i=1;
	       int sum=0;
	       for ( i=0; i<=num; i++)
	       {
	           sum=sum+i;
	       }
	       System.out.println("sum of natural number is: " +sum);

	}

}
