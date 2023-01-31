class LinkedList
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
	void display()
	{ Node n=head;
	do
	{	System.out.println(n.data);
	n=n.next;
	}while(n!=null);
	
		
	}
	
public static void main(String[] args)
{
	LinkedList l=new LinkedList();
	l.head=new Node(10);
	Node second=new Node(20);
	Node third=new Node(30);
	
	l.head.next=second;
	second.next=third;
	
	l.display();
	
	int[] nums={6,-1,-2,-3,0,1,2,3,4};
Arrays.sort(nums);
System.out.println("Minimum = " + nums[0]);
System.out.println("Maximum = " + nums[nums.length-1]);

}	
	
	
}