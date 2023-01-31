import java.util.*;
import java.io.*;

class BSTest{
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
			//System.out.println("found roll no");
			if(choice==2)
				delete(this.root, n.s.getPercent(), n.s.getRollNo());
			else if(choice== 4)
				n.s.setName();
			else if(choice==5){
				System.out.println("Updating marks for Roll No: "+ n.s.getRollNo());
				Student change=n.s;
				this.delete(this.root, n.s.getPercent(), n.s.getRollNo());
				change.setMarks();
				this.insertInTree(this.root, change);
				this.rank=0;
				this.giveRank(this.root,0);
				System.out.println("Marks Updated!");
				return;				
			}
			else if(choice==6)
				n.s.printCertificate();
			return;
		}else{
		findRollNo(n.right,rollNo,choice);
		}
		return;
	}
	
	Node delete(Node root, double key, int roll){
		if(root==null)
			return null;
		if(key<root.s.getPercent())
			root.left=delete(root.left, key,roll);
		else if(key>root.s.getPercent())
			root.right=delete(root.right, key,roll);
		else{
			if(root.s.getRollNo()==roll){
				if(root.left==null)
					return root.right;
				else if(root.right==null)
					return root.left;
				root.s=minValue(root.right);
				root.right=delete(root.right, root.s.getPercent(),roll);
			}else{
				root.left=delete(root.left, key,roll);
			}
		}
		return root;
	}
	
	Student minValue(Node root){
		Student x= root.s;
		while(root.left!=null){
			x=root.left.s;
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
		tempRank=n.s.getRank();              //storing previously value of static variable rank, to check if BarCode needs to be updated
		n.s.setRank(++rank);
		if(tempRank!=n.s.getRank())          //checking previously assigned rank with current rank
			n.s.generateBarcode();
		if(choice==3)                        //choice selected is to display the details of all students
			n.s.display();
		if(n.left!=null  && n.s.getPercent()==n.left.s.getPercent())                   //if two students have same perscentage adjust ranks
			rank--;
		if(choice==7)                        //choice selected is to display certificates of all students
			n.s.printCertificate();
		giveRank(n.left,choice);
	}
	
	
	static public void menu(){
		System.out.println("\n\t1. Insert data of a new student.");
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