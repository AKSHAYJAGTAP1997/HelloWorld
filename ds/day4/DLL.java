
class DLL
{	
	DLL1 head;
	
	static class DLL1
	{
		int x;
		DLL1 right;
		DLL1 left;
		
		DLL1(int d)
		{
			x = d;
			right = null;
			left = null;
		}
	}
	
	void push(int y)
{
	DLL1 new_DLL1 = new DLL1(y);
	new_DLL1.right = head;
	new_DLL1.left=null;
	if(head != null )
		head.left = new_DLL1;
	head = new_DLL1;
	
}

void display(DLL1 n)
{
	DLL1 p =null;
	System.out.println("Forward Display:");
	while( n != null)
	{
		System.out.print(n.x+ "--> ");
		p=n;
		n=n.right;
	}
	System.out.println("----------------");
	System.out.println("Reverse Display:");
	while( p != null)
	{
		System.out.print(p.x+"<-- ");
		p=p.left;
	}
}

void pushAfter(DLL1 left,int y)
{
	if(left == null)
		{return;}
	DLL1 new_DLL1 = new DLL1(y);
	new_DLL1.right = left.right;
	left.right = new_DLL1;
	new_DLL1.left = left;
	new_DLL1.right.left = new_DLL1;
	
}

void append(int y)
{
	DLL1 new_DLL1 = new DLL1(y);
	DLL1 n = head;
	new_DLL1.right = null;
	if(head == null)
	{
		new_DLL1.left = null;
		head = new_DLL1;
		return;
		
	}
	while(n.right != null)
	{
		n=n.right;
	}
	n.right = new_DLL1;
	new_DLL1.left = n;
	

}	
public static void main(String args[])
{	
	DLL d1 = new DLL();
	
	d1.append(90);
	
	d1.push(21);
	d1.push(11);
	d1.push(5);
	d1.display(d1.head);
	System.out.println();
	
	d1.pushAfter(d1.head, 45);
	d1.pushAfter(d1.head, 56);
	d1.pushAfter(d1.head, 75);
	d1.display(d1.head);
	System.out.println();
	
	
	d1.append(78);
	d1.display(d1.head);
	System.out.println();
	
	
}

}