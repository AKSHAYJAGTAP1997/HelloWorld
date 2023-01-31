import java.util.*;

class InsertionSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index of array");
		int index=sc.nextInt();
	System.out.println("enter elements of array");
		int a[]=new int[index];
		for(int z=0;z<a.length;z++)
		{
			a[z]=sc.nextInt();
			
			
		}
		System.out.println("elements  of array");
		for(int w:a)
		{
			System.out.print(" "+w);
		}
		System.out.println(" ");
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp )
			{
			   	a[j]=a[j-1];
				j=j-1;
				
			}
			a[j]=temp;
			
		}
		
		System.out.println("Sorted  array");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
	}
	
	
	
	
	
	
	
}