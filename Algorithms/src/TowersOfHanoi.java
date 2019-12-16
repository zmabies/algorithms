
public class TowersOfHanoi 
{
	public static void main(String a[])
	{
		move(100, "src", "aux", "dst");
	}
	
	public static void move(int nDisks, String src, String aux, String dst)
	{
		if (nDisks == 1)
		{
			System.out.println(src + " --> " + dst);
		}
		
		else
		{
			String sa, sb, sc;
			move(nDisks - 1, src, dst, aux);
			System.out.println(src + " --> " + dst);
			move(nDisks - 1, aux, src, dst);
			
			//return sa + sb + sc;
			
		}
		
	}

}

