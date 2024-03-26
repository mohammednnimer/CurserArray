package dfk;

public class CNode<T extends Comparable<T> > {

	T data;
	int next;
	public CNode(T data,int n)
	{
		
		this.data=data;
		next=n;
		
	}
	@Override
	public String toString() {
		return "CNode [data=" + data + ", next=" + next + "]";
	}
	
	
	
	
	
	
	
	
}
