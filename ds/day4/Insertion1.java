class Insertion1
{
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
			
		}
	}
	
	void display(Node n)
	{ 
	//Node n=head;
	while(n!=null)
	{
		System.out.print(n.data+"----> ");
		n=n.next;
	}
		
		
	}
	
	
	void insert(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
		
	}
	
	
	void insertAfter(Node prev, int  new_data )
	{
		if(prev==null)
		{
		System.out.println("invalid insertion");
        return;		
		}
		
		Node new_node=new Node(new_data);
		new_node.next=prev.next;
		prev.next=new_node;
	}
	
	void append(int new_data)
{
	Node new_node = new Node(new_data);
	if(head == null)
	{
		head=new_node;
		return;
	}
	new_node.next = null;
	Node n = head;
	while(n.next != null)
	{
		n = n.next;
	}
	n.next = new_node;
	return;
	
}
void delete(int key)
{
	Node temp = head, prev =null;
	if(temp.data == key && temp !=null)
	{
		head = temp.next;
		return;
	}
	while(temp !=null && temp.data != key)
	{
		prev = temp;
		temp = temp.next;
	}
	if(temp==null)
		{return;}
	prev.next = temp.next;
}

Node reverse(Node node)
{
	Node prev=null;
	Node current=node;
	Node next=null;
	while(current != null)
	{
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
	node=prev;
	return node;
		

}



		
		public static void main(String[] args)
		{
			Insertion1 l1=new Insertion1();
			
			l1.insert(11);
			l1.insert(12);
			l1.insert(13);
			l1.insert(14);
			l1.insert(15);
			
			l1.display(l1.head.next);
			System.out.println();
           //  l1.head.next=l1.reverse(l1.head.next);
			 //l1.display();
			/*l1.insertAfter(l1.head,90);
			l1.display();
			System.out.println();
			l1.insertAfter(l1.head.next.next,80);
			l1.display();
			System.out.println();
			
			l1.append(10);
			l1.display();
			
			l1.delete(10);//In between element
	System.out.println();
	l1.display();
			
			*/
			
		}
		
		
	
	
}