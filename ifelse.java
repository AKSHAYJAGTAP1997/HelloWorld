/*import java.util.Scanner;

class ifelse
{
	public static void main(String args[])
	{ 
	/*Scanner as= new Scanner(System.in);
	System.out.println("ENTER YOUR NUMER");
	int a1=as.nextInt();*/
	
	
/*	int a1=20;
	
	do
	{System.out.println("A1 IS GREATER ");
	
	}
	System.out.println("A2 IS SMALLER");
	}
	while(a1>20);
} */

import java.util.*;
class bindeci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double m,d=0;
int i=0;

System.out.println("enter the number ");
{
long n=sc.nextLong();
while(n>0)
{
m=(n%10)*Math.pow(2,i);
d=d+m;
i++;
n=n/10;
}
System.out.println(" number is"+d);
}
}
}
