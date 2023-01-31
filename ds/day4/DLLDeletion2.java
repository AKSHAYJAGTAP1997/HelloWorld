
public class DLLDeletion2 {
	DLL head; 

	class DLL {
		int data;
		DLL left;
		DLL right;
		
		DLL(int d) { 
		data = d;
       right=null;
        left=null;		
		
		}
	}

	 void push(int x)
	{
		DLL new_DLL = new DLL(x);
		new_DLL.next = head;
		new_DLL.left = null;
		
		if (head != null)
			head.left = new_DLL;
		head = new_DLL;
	}
	void display(DLL node)
	{
		DLL last = null;

		while (node != null) {
			System.out.print(DLL.data + " ");
			last = DLL;
			DLL = DLL.next;
		}

		System.out.println();
	}

	// Function to delete a DLL in a Doubly Linked List.
	// head_ref --> pointer to head DLL pointer.
	// del --> data of DLL to be deleted.
	void remove(DLL del)
	{

		// Base case
		if (head == null || del == null) {
			return;
		}

		// If DLL to be deleted is head DLL
		if (head == del) {
			head = del.next;
		}

		// Changeright only if DLL to be deleted
		// is NOT the last DLL
		if (del.next != null) {
			del.next.left = del.left;
		}

		// Change left only if DLL to be deleted
		// is NOT the first DLL
		if (del.left != null) {
			del.left.next = del.next;
		}

		// Finally, free the memory occupied by del
		return;
	}

	public static void main(String[] args)
	{
		DLLDeletion2 dll = new DLLDeletion2();
		dll.push(2);
		dll.push(4);
		dll.push(8);
		dll.push(10);

		System.out.print("Created DLL is: ");
		dll.display(dll.head);

		// Deleting first DLL
	//	dll.remove(dll.head);

		// List after deleting first DLL
		
	//	System.out.print("List after deleting first DLL: ");
	//	dll.display(dll.head);

		dll.remove(dll.head.next);
        System.out.print("List after Deleting middle DLL: ");
		dll.display(dll.head);
	}
}
