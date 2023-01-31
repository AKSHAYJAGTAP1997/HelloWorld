import java.util.*;


class even
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("NUMBER IS EVEN");
		}
		else 
		{
			System.out.println("NUMBER IS ODD");
		}
	}
}

		
		
	class factorial1
{
	public static void main(String args[])
	{
		int fact=1;
		for(int i=1;i<=5; i++)
		{
			fact=fact*i;
		}
		
			System.out.println(fact+"");
	}
}

class swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER WHICH IS SWAPPED");
		double n1=sc.nextDouble();
		double n2=sc.nextDouble();
		
		n1=n1-n2;
		n2=n1+n2;
		n1=n2-n1;
		System.out.println("SWAPEED NUMBER ARE="+n1+ " & " +n2);
	}
}



