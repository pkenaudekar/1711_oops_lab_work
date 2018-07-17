package factorial;
import java.util.Scanner;


public class factorial {
	
	private static Scanner in;

	static int fact(int n)
    {
        if (n == 0)
          return 1;
         
        return n*fact(n-1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to find its factorial:");
		in = new Scanner(System.in);		 
		int num = in.nextInt();
		System.out.println("Factorial of "+ num + " is " + fact(num));

	}

}
