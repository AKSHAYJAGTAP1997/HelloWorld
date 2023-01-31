import java.util.*;
class q3a
{
	public static void main(String args[])
	{
		for(int a=1;a<=6;a++)
		{
			for (int b=1;b<=a;b++)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
	
}

class q3b
{
	public static void main(String args[])
	{int k=0;
		for(int a=1;a<=2;a++)
		
		{
			for (int b=1;b<=3;b++)
			{
				
			System.out.print(k+" ");
				k++;
				
			
			}
			System.out.println();
		}
	}
}
	
	
class qa
{
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		for (int i=5;i>=1;i--)
		{
			for (int j=i;j<=5;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}


 
