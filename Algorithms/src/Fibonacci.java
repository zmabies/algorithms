
public class Fibonacci
{
	public static void main(String a[])
	{
		System.out.println(fib(10));
	}
	
	public static int fib(int n)
	{
		int f0 = 0;
		int f1 = 1;
		
		int fn = 0;
		
		for(int i = 2; i <= n; i++)
		{
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;
		}
		
		return fn;	
	}

}
