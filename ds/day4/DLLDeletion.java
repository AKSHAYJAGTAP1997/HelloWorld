
public class DLLDeletion {
	Node head; // head of list

	/* Doubly Linked list Node*/
	class Node {
		int data;
		Node prev;
		Node next;

		// Constructor to create a new node
		
		Node(int d) { 
		data = d;
        next=null;
        prev=null;		
		
		}
	}

	// Adding a node at the front of the list
	public void push(int new_data)
	{
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.prev = null;
		if (head != null)
			head.prev = new_Node;
		head = new_Node;
	}
	public void printlist(Node node)
	{
		Node last = null;

		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}

		System.out.println();
	}

	// Function to delete a node in a Doubly Linked List.
	// head_ref --> pointer to head node pointer.
	// del --> data of node to be deleted.
	void deleteNode(Node del)
	{

		// Base case
		if (head == null || del == null) {
			return;
		}
		if (head == del) {
			head = del.next;
		}
		if (del.next != null) {
			del.next.prev = del.prev;
		}
		if (del.prev != null) {
			del.prev.next = del.next;
		}
		return;
	}
	public static void main(String[] args)
	{
		DLLDeletion dll = new DLLDeletion();
		dll.push(2);
		dll.push(4);
		dll.push(8);
		dll.push(10);

		System.out.print("Created DLL is: ");
		dll.printlist(dll.head);

		// Deleting first node
	//	dll.deleteNode(dll.head);

		// List after deleting first node
		// 8->4->2
	//	System.out.print("\nList after deleting first node: ");
	//	dll.printlist(dll.head);

		
		dll.deleteNode(dll.head.next);

		System.out.print("\nList after Deleting middle node: ");
		dll.printlist(dll.head);
	}
}
