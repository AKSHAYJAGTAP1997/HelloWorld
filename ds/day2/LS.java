// linear search of element

import java.util.*;

class LS
{
	
	
	public static int search( int arr[], int p)
	
	{
		for(int q=0;q<arr.length;q++)
		{
			if(arr[q]==p)
			return q;
		}
		return -1;
		
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	   System.out.println("enter index of aarray");
   int n=sc.nextInt();

int arr[]=new int[n];
System.out.println(" enter elements of array");
for (int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("elements of array is   ");

for(int x:arr){
System.out.println(x);
}	
System.out.println("enter key value");
int y=sc.nextInt();
		int result=search(arr,y);
		if (result== -1)
			System.out.println("element not found");
		
		else
			System.out.println("element found");
		
		
	}
	
	
}