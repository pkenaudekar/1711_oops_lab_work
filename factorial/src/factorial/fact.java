package factorial;

public class fact {
	public static int fact_cal(int n)
    {
        if (n == 0)
          return 1;
         
        return n*fact_cal(n-1);
    }
}
