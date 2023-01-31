import java.util.*;

class Array1
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("number of element");
	int n=sc.nextInt();
	int arr[]=new int[5];
	System.out.println("enter elements of array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	
	
	System.out.println(" elements of array  are");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
		
	}
	
	int j;
	System.out.println("enter key");
	int key=sc.nextInt();
	for( j=0;j<n;j++)
	{
		if(arr[j] == key)
			break;
	}
	if(arr[j]==n)
		System.out.println("Not found");
	else
		System.out.println("Found");
	
}

}