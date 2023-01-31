/*//Write a Java program that takes a number as input and prints its multiplication 
//table upto 10.
import java.util.*;
class ww
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];		
        int i,j;
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("Argument is =");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for (i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				System.out.print("Argument is =");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for (i=0;i<c.length;i++)
		{
			for(j=0;j<c.length;j++)
			{
				//System.out.print(" ");
				c[i][j]=a[i][j]+b[i][j];
			}
			System.out.println();
		}
		for(int x[]:a)
		{
			for(int y: x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		for(int x[]:b)
		{
			for(int y: x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
		for(int x[]:c)
		{
			for(int y: x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}System.out.println();
	}
}
*/
		
	
/*import java.util.*;

class Constructor
{int x;
double y;
double z;
	Constructor()
	{
		this("AKSHAY");
		System.out.println("ANIL JAGTAP");
		
	}
	Constructor(String s)
	{
		//this.x=x;
		//this.y=y;
		
		System.out.println("SUKHWADI");
	}
	
	Constructor(double y)
	{
		System.out.println("mobile num. "+y);
	}
	public static void main(String args[])
	{
		Constructor c=new Constructor();
		Constructor c1=new Constructor(3001);
		
		
	}
}

                          
	

		*/
		
		
		
		class reverse
		{
			public static void main(String args[])
			{
				String name="AKSHAY";
				int leng=name.length();
				String a="";
				for (int i=leng-1;i>=0;i--)
				{
					a=a+name.charAt(i);
				}
				System.out.println(" "+a);
			}
		}
		