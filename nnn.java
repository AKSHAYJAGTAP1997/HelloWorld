import java.util.*;
class nnn
{
	public static void main(String args[])
	{
		Scanner as=new Scanner(System.in);
		System.out.println("enter your year");
		int a=as.nextInt();
		
		if(((a%400==0)||(a%100 !=0))&&(a%4 ==0))
		{
			System.out.println("YEAR IS LEAP");
		}
		else
		{
			System.out.println("year is not leap");
		}
	}
}

