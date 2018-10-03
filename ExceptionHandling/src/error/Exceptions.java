package error;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		try
		{
			System.out.println(5/i);
			try
			{
				int arr[]= {1,2,3};
				System.out.println(arr[5]);
			}
			catch(ArithmeticException e)
			{
				
			}
		}
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			System.out.println("Arithmatic exception has occured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arrray exception has occured");
		}
		finally
		{
			System.out.println("program has ended");
		}


	}

}
