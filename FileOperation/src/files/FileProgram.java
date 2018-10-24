package files;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileProgram
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = null;
		Writer wr = null;
		try
		{
			sc = new Scanner(new File("File"));
			wr = new FileWriter(new File("File2"));
			while(sc.hasNext())
			{
				String nextLine = sc.nextLine();
				wr.write(nextLine + "\n");
				System.out.println(nextLine);
			}
		
		sc.close();
		wr.flush();
		wr.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
