
public class BinarySearch 
{
	public static void main(String a[])
	{
		int[] ar = {1, 3, 4, 5, 7, 10, 11, 14, 15, 19, 20};
		
		System.out.println(binarySearch(ar, 14, 0, 10));


	}
	
	public static boolean binarySearch(int ar[], int key, int low, int hi)
	{
		
		 int mid = (int) Math.floor((low + hi)/2);
		 
		 //debugging
		 System.out.println(key + " ? " + ar[mid] + " -- " + low + " " + hi);
		 
		 if (key == ar[mid])
			 return true;
		 
		 if (low < hi)
		 {
			 if (key < ar[mid])
				return  binarySearch(ar, key, low, mid - 1);
			 
			 else if(key > ar[mid])
				  return binarySearch(ar, key, mid + 1, hi);
			 
		 }
		 return false;
	}

}
