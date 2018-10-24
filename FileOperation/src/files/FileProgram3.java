package files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner; 

public class FileProgram3 
{
	static final String DB_LINK = "jdbc:oracle:thin:@localhost:1521:xe";
	public static void main(String[] args) throws Exception 
	{
		
		// TODO Auto-generated method stub
		int custid = 0;
		String firstname = null,lastname = null;
		Connection con = null;
		try
		{
			//new Driver();
			con = DriverManager.getConnection(DB_LINK, "pratik", "password");
			Statement smt = con.createStatement();
			Scanner in = new Scanner(System.in); 
			System.out.println("Enter customer id:");
			String input = in.nextLine();
			custid = Integer.parseInt( input );
			System.out.println("Enter Firstname:");
			firstname = in.nextLine(); 
			System.out.println("Enter Lastname:");
			lastname = in.nextLine(); 
			String sampleQuery = "insert into test(cust_id,firstname,lastname) values('" + custid + "','" + firstname + "','" + lastname + "')";
			ResultSet results = smt.executeQuery(sampleQuery);
			sampleQuery = "select * from test";
			results = smt.executeQuery(sampleQuery);
			System.out.println("--->" + "Cust ID    "+"First Name    "+" "+"Last Name");
			while(results.next())
			{
				System.out.println("--->" +"   "+results.getString(2)+"        "+results.getString(1)+"            "+results.getString(3));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			con.close();
		}
	}
}
