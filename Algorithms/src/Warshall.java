
public class Warshall 
{
	public static void main(String a[])
	{
		byte T[][] = {{0, 1, 0, 0},{0, 0, 0, 1},{0, 0, 0, 0}, {1, 0, 1, 0}};
		byte [][]R = warshall(T); 
		
		for (int i = 0; i < R.length; i++) 
		{
            for (int j = 0; j < R[i].length; j++) 
            {
                System.out.print(R[i][j] + " ");
            }
            System.out.println();
        }	
	}
	
	public static byte[][] warshall(byte[][]T)
	{
		int n = T.length;
		byte t[][] = T;
		
		
		for(int k = 0; k < n; k++)
		{
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					if( t[i][j] == 1 || (t[i][k] == 1 && t[k][j] == 1))
						t[i][j] = 1;
					else
						t[i][j] = 0;
				}
			}
		}
		return t;
	}

}
