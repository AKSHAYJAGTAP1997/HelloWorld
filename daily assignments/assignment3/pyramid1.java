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
	{  
		for(char i='A';i<='E';i++)
		{ 
			for(char j='A';j<=i;j++)
			{
				System.out.print(i+" ");
				
				
			}
			System.out.println();
		}
	
	}
}
class q6b
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
		 for(int j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	
	}
}

class q7
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
	
	}
}

class q8b

{
	public static void main(String args[])
	{
		for( int i=5;i>=1;i--)
		{
			
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
	
	}
}

class q9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			char a=65;
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(a+" ");
				a++;
			}
			
			System.out.println();
		}
	
	}
}



class q11
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	
	}
}

class q12
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	
	}
}
/*class q13
{
	public static void main(String args[])
	{
		for(char i='A';i<='E';i++)
		{
			
			
			for(int j=4;j>=1;j--)
			{
				System.out.print("  ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print(i);
				System.out.print(" ");
			}
			
			System.out.println();
		}
	
	}
}*/

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
class q16
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

class q17
{
	public static void main(String args[])
	{
		int c=1;
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}

class q18
{
	public static void main(String args[])
	{
		for(char i='E';i>='A';i--)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	
	}
}

class pyramid1

{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			
			
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+"  ");
			}
			
			System.out.println();
		}
	
	}
}