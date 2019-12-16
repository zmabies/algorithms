import java.util.Arrays;

public class QuickSort 
{
	public static void main(String a[])
	{
		int ar[] = {2, 5, -1, 4, -3};
		
		quickSort(ar, 0, 4);
		
		System.out.println(Arrays.toString(ar));
	}
	
	public static void quickSort(int[] ar, int p, int r)
	{

		if (p < r)
		{
			int q = partition(ar, p, r);
			
			quickSort(ar, p, q);
			quickSort(ar, q + 1, r);
			

		}
		
			
	}

	private static int partition(int[] ar, int l, int h)
	{
		int pivot = ar[l];
		int i = l - 1; 
		int j = h + 1;

		do
		{
			do
			{
				if(i < h)
					i++;
			}while (!(ar[i] >= pivot));
			
			do
			{
				if(j > l)
					j--;	
			}while (!(ar[j] <= pivot));
			
			swap(ar, i, j);
			
		}while(!(i >= j));
		
		swap(ar, i, j);
		swap(ar, l, j);
		
		return j;
		
	}
	
	private static void swap(int[] ar, int i, int j) {
	    int temp = ar[i];
	    ar[i] = ar[j];
	    ar[j] = temp;
	  }

}
