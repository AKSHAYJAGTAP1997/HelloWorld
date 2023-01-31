import java.util.*;

class q1
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

class q2
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			char a=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print("  "+a);
				a++;
			}
			System.out.println();
		}
	
	}
}

class q3
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	
	}
}
class q4
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	
	}
}
class q5
{
	public static void main(String args[])
	{  //char k=65;
		for(char i='A';i<='E';i++)
		{ 
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
				//k++;
				
			}
			System.out.println();
		}
	
	}
}

class q14
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	}
}

class q15
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	}
}


