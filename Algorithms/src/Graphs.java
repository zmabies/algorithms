public class Graphs 
{
	public static void main(String a[])
	{
		int g[][] = {{0, 1, 1},{1, 0, 1},{1, 1, 0}};
		
		System.out.println("complete: "+isComplete(g));
		System.out.println("symmetric: "+isSymmetric(g));

	}
	
	//******************************************
	public static boolean isComplete( int g[][])
	{
		for (int i = 0; i < g.length; i++)
		{
			for (int j = 0; j < g.length; j++)
			{
				if ((g[i][j] != 1) && (i != j))
					return false;
			}
		}
		return true;
	}
	
	//******************************************
	public static boolean isSymmetric( int g[][])
	{
		for (int i = 0; i < g.length; i++)
		{
			for (int j = 0; j < g.length; j++)
			{
				if (g[i][j] != g[j][i])
					return false;
			}
		}
		return true;
	}
	
	//******************************************
}
