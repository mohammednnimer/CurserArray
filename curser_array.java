package dfk;

import java.util.Iterator;



public class curser_array<T extends Comparable<T> > {

	CNode<T> newnode[];

	public curser_array(int x) {
		inttilized(x);

	}

	public void inttilized(int n) {
		newnode = new CNode[n];
		for (int i = 0; i <= newnode.length - 2; i++) {
			
			newnode[i] = new CNode(null, i + 1);

		}

		newnode[n - 1] = new CNode(null, 0);

	}

	public int malloc() {
		int p = newnode[0].next;
		newnode[0].next = newnode[p].next;
		return p;
	}

	public void free(int p) {
		if (p > newnode.length) {
			return;
		}

		newnode[p].next = newnode[0].next;
		newnode[0].next = p;

	}

	public int creartlist() {
		int n = malloc();
		if (n != 0) {
			newnode[n] = new CNode("domain", 0);
return n;
			
		}
System.out.println("sorry the list is full");
		return 0;
	}


public void insertFirst(T data,int l)
{

	int p=malloc();
	if(p!=0)
	{
		newnode[p].data=data;
		newnode[p].next=newnode[l].next;
		newnode[l].next=p;
		
		
		
		
	}
	
	
	
}
public void insertlast(T data,int l)
{
	int p=malloc();
	if(p!=0)
	{
	
		newnode[p]=new CNode<>(data, p);
		int last=l;
		while (newnode[last].next!=0) {
			last=newnode[last].next;
		}
		newnode[p].next=newnode[last].next;
		newnode[last].next=p;
		
		
	}
	else
	{
		System.out.println("sorry the arrayis full");
	}
	
	
	
}
public T deletFirst(int l)
{
	if(newnode[l]!=null)
{
	int x=newnode[l].next;
	newnode[l].next=newnode[x].next;
	T data=newnode[x].data;
	free(x);
	newnode[x].data=null;
	return data;
	
}	
	
	
	
	
	return null;
}

public void Insert_Sorting(T data,int l)
{
int p=malloc();
if(p!=0) {
if(newnode[l]!=null) {	

	
newnode[p]=new CNode<>(data,0);
int first=newnode[l].next;


if(newnode[first].data==null)
{

	newnode[p].next = first;
	
    newnode[l].next = p;

	return;
	
}

int last=first;
while (newnode[first].data.compareTo(newnode[p].data)<0&&newnode[newnode[first].next].data!=null) {
	System.out.println(newnode[first].data);
	last=first;
	System.out.println("llllleeeshhh");
	first=newnode[first].next;

}
if(newnode[newnode[first].next].data!=null&&newnode[first].data.compareTo(newnode[p].data)<0)
{
	
	newnode[p].next=0;
	newnode[last].next=p;
	

}
else if(newnode[newnode[first].next].data==null)
{
	newnode[p].next=first;
	newnode[last].next=p;
	System.out.println(data);
	
	
}else 
{

	newnode[p].next=first;
	newnode[last].next=p;
	
}



}
}

	
	
	
	
}























public void transv()
{
	
	for (int i=0;i<newnode.length;i++)
	{
		System.out.println(newnode[i]);
	}
	
	
	
}
}