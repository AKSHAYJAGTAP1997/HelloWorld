// with methods

import java.util.*;

class ArrayDemo
{
	ArrayDemo()
	{
		
		 System.out.println("enter elements of ...........");
		
	}
	
	
	
}



class Array3
{
	public static void main(String[] args)
	{
   Scanner sc=new Scanner(System.in);
   ArrayDemo a=new ArrayDemo();
   int n=sc.nextInt();
   int i;
   int arr[]=new int[3];
   System.out.println("enter elements of array");
	for( i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	   
		 System.out.println(arr[i]);
		
		
		
	}
	
}

