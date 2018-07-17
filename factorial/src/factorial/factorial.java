package factorial;
import java.util.Scanner;
import factorial.fact;

public class factorial {
	
	private static Scanner in;

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to find its factorial:");
		in = new Scanner(System.in);		 
		int num = in.nextInt();
		System.out.println("Factorial of "+ num + " is " + fact.fact_cal(num));

	}

}
