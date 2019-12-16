package graphs_;

public interface GraphInterface 
{
	public Object getVertex();
	
	public void visit();
	
	public boolean isVisited();
	
	public boolean connect(Object from, Object to);
	
	public boolean connect(Object from, Object to, int weight);
	
	public boolean hasAdj();
	
	public Object getUnvisitedAdj();
	
	public Object getPrev();
	
	public Object hasPrev();
	
	public void setWeight(int weight);
	
	public int getWeight();


}
