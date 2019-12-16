
public class IsHeap 
{
	public static void main(String a[])
	{
		int[] A = {5, 4, 3, 2, 1};
		System.out.println(isMaxHeap(A, 0, 4));
		
		int[] A1 = {1, 2, 3, 4, 5};
		System.out.println(isMinHeap(A1, 0, 4));
	}
	
	public static boolean isMaxHeap(int ar[], int i, int n)
	{
		if(i > ((int)Math.floor((n-2)/2)))
			return true;
		
		if(ar[i] >= ar[2*i + 1] && ar[i] >= ar[2*i + 2] && isMaxHeap(ar, 2*i+1, n) && isMaxHeap(ar, 2*i+2, n))
			return true;
				
		return false;
	}
	//*************************min heap*****************************************
	public static boolean isMinHeap(int ar[], int i, int n)
	{
		if(i > ((int)Math.floor((n-2)/2)))
			return true;
		
		if(ar[i] <= ar[2*i + 1] && ar[i] <= ar[2*i + 2] && isMinHeap(ar, 2*i+1, n) && isMinHeap(ar, 2*i+2, n))
			return true;
				
		return false;
	}

}
