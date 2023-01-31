import java.util.Scanner;
 
class SBBSTNodes
{
    SBBSTNodes left, right;
    int        data;
    int        height;
 
    public SBBSTNodes()
    {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }
 
    public SBBSTNodes(int n)
    {
 
        left = null;
        right = null;
        data = n;
        height = 0;
    }
}
 
class SelfBalancingBinarySearchTrees
{
    private SBBSTNodes root;
 
    public SelfBalancingBinarySearchTrees()
    {
        root = null;
    }
 
    public boolean isEmpty()
    {
        return root == null;
    }
 
    public void clear()
    {
        root = null;
    }
 
    public void insert(int data)
    {
        root = insert(data, root);
    }
 
    private int height(SBBSTNodes t)
    {
 
        return t == null ? -1 : t.height;
    }
 
    private int max(int lhs, int rhs)
    {
        return lhs > rhs ? lhs : rhs;
    }
 
    private SBBSTNodes insert(int x, SBBSTNodes t)
    {
        if (t == null)
            t = new SBBSTNodes(x);
        else if (x < t.data)
        {
            t.left = insert(x, t.left);
            if (height(t.left) - height(t.right) == 2)
                if (x < t.left.data)
                    t = rotateWithLeftChild(t);
                else
                    t = doubleWithLeftChild(t);
        } else if (x > t.data)
        {
            t.right = insert(x, t.right);
            if (height(t.right) - height(t.left) == 2)
                if (x > t.right.data)
                    t = rotateWithRightChild(t);
                else
                    t = doubleWithRightChild(t);
        } else
            ;
        t.height = max(height(t.left), height(t.right)) + 1;
        return t;
    }
 
    private SBBSTNodes rotateWithLeftChild(SBBSTNodes k2)
    {
        SBBSTNodes k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = max(height(k2.left), height(k2.right)) + 1;
        k1.height = max(height(k1.left), k2.height) + 1;
        return k1;
    }
 
    private SBBSTNodes rotateWithRightChild(SBBSTNodes k1)
    {
        SBBSTNodes k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max(height(k1.left), height(k1.right)) + 1;
        k2.height = max(height(k2.right), k1.height) + 1;
        return k2;
    }
 
    private SBBSTNodes doubleWithLeftChild(SBBSTNodes k3)
    {
        k3.left = rotateWithRightChild(k3.left);
        return rotateWithLeftChild(k3);
    }
 
    private SBBSTNodes doubleWithRightChild(SBBSTNodes k1)
    {
        k1.right = rotateWithLeftChild(k1.right);
        return rotateWithRightChild(k1);
    }
 
    public int countNodes()
    {
        return countNodes(root);
    }
 
    private int countNodes(SBBSTNodes r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }
 
    public boolean search(int val)
    {
        return search(root, val);
    }
 
    private boolean search(SBBSTNodes r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.data;
            if (val < rval)
                r = r.left;
            else if (val > rval)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
 
    public void inorder()
    {
        inorder(root);
    }
 
    private void inorder(SBBSTNodes r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }
 
    public void preorder()
    {
 
        preorder(root);
    }
 
    private void preorder(SBBSTNodes r)
    {
        if (r != null)
        {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }
 
    public void postorder()
    {
        postorder(root);
    }
 
    private void postorder(SBBSTNodes r)
    {
        if (r != null)
        {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
}
 
public class Balanced_B_Tree
{
    public static void main(String[] args)
    {
        public static void main(String args[])throws FileNotFoundException{
		//To insert the data of students already present
		File file = new File("D:\\projects\\StudentGrading\\StudentDetails.txt");
		Scanner sf = new Scanner(file);
		BSTest rankTree=new BSTest();
		int noOfStudents=sf.nextInt();
		Student s;
		Node n;
		String tempName;
		int tempMarks[]=new int[Student.subject.length];
		try{
			sf.nextLine();
			for(int i=0; i<=noOfStudents; i++){
				tempName=sf.nextLine();
				for(int j=0; j<Student.subject.length; j++)
					tempMarks[j]=sf.nextInt();
				s=new Student(tempName, tempMarks);
				sf.nextLine();
				n=new Node(s);
				rankTree.insertInTree(rankTree.root, s);
			}
		}catch(Exception e){};
		rankTree.giveRank(rankTree.root, 3);
		char cont='y';
		int choice=0,tempRollNo;
		while(cont=='y' || cont=='Y'){
			menu();
			try{
				choice=sc.nextInt();
			switch(choice){
				case 1:
					Student newStudent=Student.insertStudent();
					if(newStudent!=null){
						rankTree.insertInTree(rankTree.root, newStudent);
						System.out.println("New Student inserted successfully!");
					}
					break;
				case 2:
					System.out.print("Enter the Roll Number of the student to be deleted: ");
					tempRollNo=sc.nextInt();
					rankTree.findRollNo(rankTree.root, tempRollNo, 2);
					System.out.println("Student deleted successfully!");
					break;
				case 3:
					rankTree.rank=0;
					rankTree.giveRank(rankTree.root,3);
					break;
				case 4:
					System.out.print("Enter the Roll Number of the student: ");
					tempRollNo=sc.nextInt();
					rankTree.findRollNo(rankTree.root, tempRollNo, 4);
					break;
				case 5:
					System.out.print("Enter the Roll Number of the student: ");
					tempRollNo=sc.nextInt();
					rankTree.findRollNo(rankTree.root, tempRollNo, 5);
					break;
				case 6:
					System.out.print("Enter the Roll Number of the student: ");
					tempRollNo=sc.nextInt();
					rankTree.findRollNo(rankTree.root, tempRollNo, 6);
					break;
				case 7:
					rankTree.rank=0;
					rankTree.giveRank(rankTree.root,7);
					break;
				default:
					System.out.println("You entered a wrong choice");
			}
			}catch(Exception e){
				System.out.println("XXXXX Incorrect Input XXXXX");
				sc.nextLine();
			}
			System.out.print("Do you wish to continue? (Y/N): ");
			cont=sc.next().charAt(0);
		}
	}
    }
}