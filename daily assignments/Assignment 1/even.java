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


