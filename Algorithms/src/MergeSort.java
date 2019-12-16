import java.util.Arrays;

public class MergeSort 
{
	public static void main(String a[])
	{
		int ar[] = {9, 4, 5, 8, 2, 7, 3, 6, 1};
		
		mergeSort(ar, 0, 8);
		
		System.out.println(Arrays.toString(ar));
	}
	
	 private static void mergeSort(int[] ar, int lo, int hi) 
	 {
	        if (lo < hi) 
	        {
	            int mid = (lo + hi) / 2;
	            
	            mergeSort(ar, lo, mid);           
	            mergeSort(ar, mid + 1, hi);     
	            merge(ar, lo, mid, hi);      
	        }
	    }

	    private static void merge(int[] ar, int lo, int mid, int hi) {
	        
	    	
	        int[] left = new int[(mid - lo) + 2];        
	        int[] right = new int[hi - mid + 1];         


	        // create the left and right sub-list for merging into original list.
	        System.arraycopy(ar, lo, left, 0, left.length - 1);
	        System.arraycopy(ar, mid + 1, right, 0, right.length - 1);
	        
	        left[left.length - 1] = 1000; //ascending: max value
	        right[right.length - 1] = 1000; //descending: min value

	        int i = 0;
	        int j = 0;

	        
	        for (; lo <= hi; lo++)  
	        {
	            if (left[i] <= right[j])  //just swap the sign to make it sort ascending or descending
	            {
	                ar[lo] = left[i];
	                i++;
	            } 
	            else 
	            {
	                ar[lo] = right[j];
	                j++;
	            }
	        }
	    }
}
