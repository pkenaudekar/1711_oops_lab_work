package files;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class FileProgram2 {
	static final String DB_LINK = "jdbc:oracle:thin:@localhost:1521:xe";
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con = null;
		try
		{
			//new Driver();
			con = DriverManager.getConnection(DB_LINK, "pratik", "password");
			Statement smt = con.createStatement();
			String sampleQuery = "select * from student";
			ResultSet results = smt.executeQuery(sampleQuery);
			while(results.next())
			{
				System.out.println("--->" + results.getString(1));
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
