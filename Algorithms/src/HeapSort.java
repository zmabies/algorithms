import java.util.Arrays;

public class HeapSort 
{
	public static void main(String a[])
	{
		int[] ar = {4, 1, -13, 2, 16, 9, 10, 14, 8, 7};
		
		System.out.println(Arrays.toString(ar));
		
		heapSort(ar);
		
		System.out.println(Arrays.toString(ar));
				
	}
	
	public static void heapSort(int ar[])
    {
		int n = ar.length;
		for (int i = n / 2 - 1; i >= 0; i--)
		{
			heapify(ar, n, i);
		}
		for (int i=n-1; i>=0; i--)
		{
			swap(ar, i, 0);
			heapify(ar, i, 0);
        }
    }

	static void heapify(int ar[], int n, int i)
	{
		int largest = i; 
	    int L = 2*i + 1; 
	    int R = 2*i + 2; 
	    
	    if (L < n && ar[L] > ar[largest])
	        largest = L;

	    if (R < n && ar[R] > ar[largest])
	        largest = R;

	    if (largest != i)
	    {
	        swap(ar, i, largest);
	        heapify(ar, n, largest);
	    }
     }
	
	private static void swap(int[] ar, int i, int j) {
	    int temp = ar[i];
	    ar[i] = ar[j];
	    ar[j] = temp;
	  }

}
