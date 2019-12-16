import java.util.Arrays;
import java.util.Scanner;

public class Knapsack_Problem 
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of items:\t");
		int n = sc.nextInt();
		Item[] item = new Item[n];
		
		for(int i = 0; i < item.length; i++)
		{
		    item[i] = new Item();
			
			System.out.print("\nEnter item value:\t");
			item[i].value = sc.nextInt();
			System.out.print("\nEnter item weight:\t");
			item[i].weight = sc.nextInt();
		}
		
		Item temp;
		
		for(int i = 0; i < n; i++)
		{
			item[i].density = item[i].value/item[i].weight;
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n - 1; j++)
			{
				if(item[j+1].density > item[j].density)
				{
					temp = item[j+1];
					item[j+1] = item[j];
					item[j] = temp;
				}
			}
		}
		
		System.out.print("\nEnter knapsack capacity:\t");
		int W = sc.nextInt();
		
		sc.close();

		System.out.println(Arrays.toString(greedyFractionalKS(item, W)));
			
	}//main
	
	public static double[] greedyFractionalKS(Item[] item, int W)
	{
		int n = item.length;
		
		double[]x = new double[n];
		int weight = 0, profit = 0;

		
		for(int i = 0; i < n; i++)
		{
			if((item[i].weight + weight) <= W)
			{
				weight += item[i].weight;
				profit += item[i].value;
				x[i] = 1;
			}
			else
			{
				
				x[i] = ((float)(W - weight)/item[i].weight);
				profit += item[i].value * x[i];
				//System.out.println("X=" + x[i]);
				break;
				
			}

		}
		System.out.println("\n\nprofit:\t" + profit);
		return x;
	}

	public static class Item
	{
		public int value;
		public int weight;
		public double density;

	}
}

