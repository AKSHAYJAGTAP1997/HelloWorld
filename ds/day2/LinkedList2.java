class LinkedList2
{	
	int head;
	{
		System.out.println("Patil ki den");
		System.out.println(head);
	}
    class Node
	{
	int data;
	int next;
	{
		System.out.println("Shinde ki den");
	}
	Node(int d)
	{
		data=d;
		next=0;
	}
	}
	
	void display()
	{
		int n=head;
		while(n != 0)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
			
	}
	
public static void main(String args[])
{	
	LinkedList2 l1 = new LinkedList2();
	//LinkedList2.Node N = new LinkedList2().new Node();
	
	l1.head = new LinkedList2().new Node(10);
	LinkedList2.Node second = new LinkedList2().new Node(20);
	LinkedList2.Node third = new LinkedList2().new Node(30);
	
	
	l1.head.next = second;
	second.next = third;
	
	l1.display();
	
}

}
