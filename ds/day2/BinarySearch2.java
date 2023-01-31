import java.util.*;
class BinarySearch2
{
	public static int bsearch(int arr[], int key, int low, int high)
	{
		if(high>=low)
		{
			int mid=low+(high-low)/2;
			
			if(arr[mid] == key)
				return key;
			
			if(arr[mid] > key)
				return bsearch(arr,key, low,mid-1);
			return bsearch(arr,key,mid+1,high);
			
		}return -1;
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index of array");
		int n=sc.nextInt();
		System.out.println("elements of array is ");
		int arr[]=new int[n];
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		}
		
		for(int y:arr)
		{
			System.out.println(y);
		}
		System.out.println("enter key value ");
		int key = sc.nextInt();
		int low=0;
		int high=arr.length-1;
		int result=bsearch(arr,key,low,high);
		
		if(result == -1)
		{	
		System.out.println("ELEMENT NOT FOUND");
		}
		else
		{
			System.out.println("ELEMENT FOUND");
		}		
	}
	
	
}