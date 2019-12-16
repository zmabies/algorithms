import java.util.Arrays;

public class InsertionSort 
{
	public static void main(String a[])
	{
		int[] ar = {2, 4 ,6 ,8 ,1 ,9 ,3 ,17, 12, 5};
		
		int[] sorted = insertionSort(ar);
		
		System.out.print(Arrays.toString(sorted));
	}
	
	public static int[] insertionSort(int ar[])
	{
		int key, j;
		for(int i = 1; i <  ar.length; i++)
		{
			key = ar[i];
			j = i - 1;
			
			while ((j >= 0) && (ar[j] > key))
			{
				ar[j + 1] = ar[j];
				j = j - 1;
			}
			ar[j + 1] = key;
			System.out.print("iter " + i +" "+ Arrays.toString(ar));
		}
		return ar;
	}

}
