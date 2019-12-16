
public class Floyd 
{
	public static void main(String a[])
	{
		int inf =10000; //max_value and positive infinity dont work..
		int[][] W = {{0, inf, 3, inf},{2, 0, inf, inf},{inf, 7, 0, 1},{6, inf, inf, 0}};
		
		int[][] D = floyd(W);
		
		for (int i = 0; i < D.length; i++) 
		{
            for (int j = 0; j < D[i].length; j++) 
            {
                System.out.print(D[i][j] + " ");
            }
            System.out.println();
        }	
	}
	
	public static int[][] floyd(int[][]W)
	{
		int n = W.length;
		for(int k = 0; k < n; k++)
		{
			for(int i = 0; i < n; i++)
			{
				for(int j = 0; j < n; j++)
				{
					W[i][j] = Math.min(W[i][j], (W[i][k] + W[k][j]));
				}
			}
		}
		
		return W;
	}

}
