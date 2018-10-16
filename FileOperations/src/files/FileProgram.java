package files;
import java.io.File;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		try
		{
			sc = new Scanner(new File("File"));
			while(sc.hasNext())
			{
				System.out.println(sc.next());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
