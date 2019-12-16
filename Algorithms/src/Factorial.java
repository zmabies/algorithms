
public class Factorial 
{
	public static void main(String a[])
	{
		System.out.println(fact(6));
	}
	
	public static int fact(int n)
	{
		if (n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}

}
