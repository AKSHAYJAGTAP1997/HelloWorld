import java.util.*;
import java.io.*;

class BST{
	static Scanner sc=new Scanner(System.in);
	
	Node root;
	static int rank=0;
	
	static class Node{
		Student s;
		Node left;
		Node right;
		
		Node(Student s){
			this.s=s;	
		}
	}
	
	
//Function to create a new node	
	public Node insertInTree(Node n, Student newStudent){
		if(this.root==null)
			this.root=new Node(newStudent);
		if(n==null)
			return n=new Node(newStudent);
		if(newStudent.getPercent()<=n.s.getPercent())
			n.left=insertInTree(n.left, newStudent);
		else 
			n.right=insertInTree(n.right, newStudent);
		return n;
	}
	
	public void findRollNo(Node n, int rollNo,int choice){
		if(n==null){
			return;
		}
		
		findRollNo(n.left,rollNo, choice);
		if(n.s.getRollNo()==rollNo){
			//System.out.println(n.s.getRank());
			if(choice==2)
				delete(this.root, n.s.getRank());
			else if(choice== 4)
				n.s.setName();
			else if(choice==5){
				Student change=n.s;
				System.out.println(n.s.getRank());
				
				System.out.println(n.s.getRank());
				System.out.println(change.getRank());
				change.setMarks();
				this.insertInTree(this.root, change);
				this.rank=0;
				this.giveRank(this.root,0);
				this.delete(this.root, n.s.getRank());
				
			}
			else if(choice==6)
				n.s.printCertificate();
			return;
		}
		findRollNo(n.right,rollNo,choice);
	}
	
	Node delete(Node root, int key){
		if(root==null)
			return null;
		if(key>root.s.getRank())
			root.left=delete(root.left, key);
		else if(key<root.s.getRank())
			root.right=delete(root.right, key);
		else{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.s.setRank(minValue(root.right));
			root.right=delete(root.right, root.s.getRank());
		}
		return root;
	}
	
	int minValue(Node root){
		int x= root.s.getRank();
		while(root.left!=null){
			x=root.left.s.getRank();
			root=root.left;
		}
		return x;
	}
	
	
//Function to update ranks when a new student is added or marks of an existing student is changed
	public void giveRank(Node n, int choice){
		if(n==null)
			return;
		int tempRank;
		giveRank(n.right,choice);
		tempRank=n.s.getRank();              //storing previously value of static variable rank
		n.s.setRank(++rank);
		if(tempRank!=n.s.getRank())          //checking previously assigned rank with current rank
			n.s.generateBarcode();
		if(choice==3)                        //choice selected is to display the details of all students
			n.s.display();
		if(n.left!=null  && n.s.getPercent()==n.left.s.getPercent())                   //if two students have same perscentage adjust ranks
			rank--;
		if(choice==7)                        //choice selected is to display the details of all students
			n.s.printCertificate();
		giveRank(n.left,choice);
	}
	
	
	static public void menu(){
		System.out.println("\n\t1. Insert data of new student.");
		System.out.println("\t2. Delete data of an existing student.");
		System.out.println("\t3. Display the data of all students.");
		System.out.println("\t4. Change Name of a student.");
		System.out.println("\t5. Change marks of a student.");
		System.out.println("\t6. Display the certificate of a particular student.");
		System.out.println("\t7. Display the certificate of all students.");
		System.out.print("Enter your choice: ");
		
	}
	
	
//The main function
	public static void main(String args[])throws FileNotFoundException{
		//To insert the data of students already present
		File file = new File("D:\\projects\\StudentGrading\\StudentDetails.txt");
		Scanner sf = new Scanner(file);
		BST rankTree=new BST();
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
					if(newStudent!=null)
						rankTree.insertInTree(rankTree.root, newStudent);
					break;
				case 2:
					System.out.print("Enter the Roll Number of the student to be deleted: ");
					tempRollNo=sc.nextInt();
					rankTree.findRollNo(rankTree.root, tempRollNo, 2);
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