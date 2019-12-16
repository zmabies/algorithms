
public class HornersRule 
{
	public static void main(String a[])
	{
		int []ar = {-5, 1, 3, -1, 2};
		
		System.out.println(horner(ar, 3));
		System.out.println(bruteForcePolynomial(ar, 3));
	}
	
	public static double horner(int ar[], int x)
	{
		int n = ar.length - 1;
		int p = ar[n];
		for(int i = n -1; i >= 0; i--)
		{
			//System.out.print(p + "  ");
			p = x * p + ar[i];
			
		}
		
		return p;
	}
	
	public static double bruteForcePolynomial(int ar[], int x)
	{
		int n = ar.length - 1;
		int p = 0;
		int power;
		
		for(int i = n; i >= 0; i--)
		{
			power = 1;
			for(int j = 1; j <= i; j++)
				power = power * x;
			
			 p = p + ar[i] * power;	
		}
		
		
		return p;
	}
	
	

}
