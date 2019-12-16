
public class Exp 
{
	public static void main(String a[])
	{
		System.out.println(exp(7, 2));
	}
	
	public static int exp(int n, int a)
	{
		if (n == 1)
			return a;
		else if (n % 2 == 0)
			return exp((int)Math.floor(n/2), a) * exp((int)Math.floor(n/2), a);
		else 
			return exp((int)Math.floor(n/2), a) * exp((int)Math.floor(n/2), a) * a;
	}

}
