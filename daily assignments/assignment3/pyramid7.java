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

class q10b
{
	public static void main(String args[])
	{
		char[] a={'E','D','C','B','A'};
		for (int i=0;i<a.length;i++)
		{
			for ( int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=0;j<i;j++)
			{
				System.out.print(a[i-j]+" ");
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
class q13a
{
	public static void main(String args[])
	{
		char[] a={'A','B','C','D','E'};
		for (int i=0;i<a.length;i++)
		{
			for ( int k = 5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++)
			{
				System.out.print(a[i]+" ");
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

class pyramid2

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
				System.out.print(k+"  ");
			}
			
			System.out.println();
		}
	
	}
}

class pyramid3

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
				System.out.print("* ");
			}
			
			System.out.println();
		}
	
	}
}

class pyramid4
{
	public static void main(String args[])
	{ 
	  for ( int i=1;i<=9;i++)
	  {
		  for (int j=8;j>=i;j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k=i-1;k>=-(i-1);k--)
		  { System.out.print(i-Math.abs(k));
		  }
		  System.out.println();
	  }
	}
}

		class pyramid5
		{
	public static void main(String args[])
	{ 
	int n=9;
	  for ( int i=1;i<=n;i++)
	  { 
      for(int j=1;j<=n*2;j++)
	  {
		  
		 if(j>=n-i+1&&j<=n)
		 {
			 System.out.print(j+" ");
		 }
		 else if (j>n&& j+1<=n+i)
		 {
			 System.out.print((n*2-j)+" ");
		 }
		 else
		 {
			 System.out.print(" ");
		 }
	  }
	  
		 System.out.println();
	  }
	}
		}
		
	
	
	
	
	
	
	class pyramid6
	
	 {
		public static  void main (String args[])
		
		{ 
		   int k=9;
			
			for (int i=k;i>=1;i--)
			{
				for( int j=k-1;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int m=i;m>=1;m--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	
  }
  
  class pyramid7
  
   {
		public static  void main (String args[])
		
		{ 
		   int k=9;
			
			for (int i=k;i>=1;i--)
			{
				for( int j=k-1;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int m=i;m>=1;m--)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
	
  }
  