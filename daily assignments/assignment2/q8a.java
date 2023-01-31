/*Write a Java program to print 'Hello' on screen and then print your name on a 
separate line*/
import java.util.Scanner;
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println("HELLO");
		
		System.out.println("AKSHAY JAGTAP FROM KHARGHHAR");
	}
	
	}
	
	/* Write a Java program to print the sum of two numbers.*/
	class q2
	{
		public static void main(String args[])
		{
			int n1;int n2;int sum;
			n1=74;
			 n2=36;
			sum=n1+n2;
			System.out.println("SUM IS...."+sum);
		}
	}
	
	/* . Write a Java program to divide two numbers and print on the screen*/
	
	class q3
	{
		public static void main(String args[])
		{
			int n1;int n2; int max;
			n1=50;
			n2=3;
			max=50/3;
			System.out.println("ANSWER IS...."+max);
		}
	}
	
	
	
	
	/* Write a Java program to print the result of the following operation */
	
	class q4
	{
		public static void main(String args[])
		{
		String s1=args[0];
		String s2=args[1];
		String s3=args[2];
		
		int i1=Integer.parseInt(s1);
		int i2=Integer.parseInt(s2);
		int i3=Integer.parseInt(s3);
		
		System.out.println("ANSWER IS= "+(-i1+i2*i3));
	}
}



class q4b
{
	public static void main(String args[])
	{
		int a=55;
		int b=9;
		int c=(a+b)%b;
		int d=20+(-3*5)/8;
		int e=5+15/(3*2)-8%3;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
			
	
	/* Write a Java program that takes two numbers as input and display the product of 
two numbers. */

class q5
{
	 public static void main(String args[])
	 {
		 String n1=args[0];
		 String n2=args[1];
		 
		 int a1=Integer.parseInt(n1);
		 int a2=Integer.parseInt(n2);
		 
		 System.out.println("Product of given two number is....="+(a1*a2));
	 }
}
		 
		/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers */

class q6
{
	public static void main(String args[])
	{
		String n1=args[0];
		String n2=args[1];
		
		int a1=Integer.parseInt(n1);
		int a2=Integer.parseInt(n2);
		
		System.out.println("sum of two numbers= "+(a1+a2));
		System.out.println("substraction of two number= "+(a1-a2));
		System.out.println("multiplication of two num= "+(a1*a2));
		System.out.println("dividation of two num= "+(a1/a2));
	}
}

/* Write a Java program that takes a number as input and prints its multiplication 
table upto 10.*/

// import java.util.Scanner;
 class q7
 {
	 public static void main(String args[])
	 {
		 Scanner aj= new Scanner(System.in);
		 System.out.println("ENTER THE NUMBER= ");
		 int n = aj.nextInt();
		 for(int i=1;i<=10;i++)
		 {
			 System.out.println(n+"*"+i+"="+n*i);
		 }
	 }
 }	
 //. Write a Java program to display the following pattern. 
 
 class q8a
{ 
public static void main(String args[])
{
	System.out.println("   J    A    V     V     A");
	System.out.println("   J   A A    V   V     A A ");
	System.out.println("J  J  A A A    V V     A A A");
	System.out.println(" JJ  A     A    V     A     A ");
}
}

// Write a Java program to compute the specified expressions and print the output

class q9
{
	public static void main(String args[])
	{
		double a=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		 System.out.println("VALUE OF EXPRESION IS= " +a);
	}
}

//. Write a Java program to compute a specified formula.

class q10
{
	public static void main(String args[])
	{
		double b=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println("VALUE OF GIVEN EXPRESSION="+b);
	}
}

//Write a Java program to compute a specified formula




// Write a Java program to print the area and perimeter of a circle. 

class q11

{
	public static void main(String args[])
	{
		Scanner radious= new Scanner(System.in);
		System.out.println("ENTER RADIUS");
		int r1= radious.nextInt();
		final float pi= (float)3.14;
		float area= pi*r1*r1;
		System.out.println("AREA OF GIVEN RADIOUS IS="+area);
		float peripheral= 2*pi*r1;
		System.out.println("peripheral is...="+peripheral);
		
	}
}

/*2. Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers*/

class q12
{
	public static void main(String args[])
	{
		Scanner av=new Scanner (System.in);
		System.out.println("ENTER 3 NUMBER=");
		double d1= av.nextDouble();
		double d2=av.nextDouble();
		double d3=av.nextDouble();
		
		double avrg= (double) (d1+d2+d3)/3;
		System.out.println("AVRAGE OF GIVEN NUM="+avrg);
	}
}

//Write a Java program to print the area and perimeter of a rectangle.

 class q13
 {
	 public static void main(String args[])
	 {
		 double width=(double)5.5;
		 double height=(double)8.5;
		 double area=width*height;
		 System.out.println("AREA OF GIVEN WIDTH AND LENGTH="+area);
		 double perimeter=2*(width+height);
		 System.out.println("PERIMETER IS="+perimeter);
		 
	 }
 }
 //write a Java program to print an American flag on the screen. 
	
		 class q14
 {
	 public static void main(String args[])
	 {
		
		System.out.println("AMERICAN FLAG");
		
		 for(int i=0; i<7;i++)
			 
			 {
			 				 System.out.println(" * * * * ================ ");
			 }
			 for (int j=0;j<9;j++)
			 {
				 System.out.println(" ========================");
			 }
	 }
 }
 //Write a Java program to swap two variables.
 class q15a
 {
	 public static void main(String args[])
	 {
		 Scanner as=new Scanner (System.in);
		 System.out.println("ENTER NUMBER 1 FOR SWAP");
		 double n1=as.nextDouble();
		 System.out.println("ENTER NUMBER2 FOR SWAP");
		 double n2=as.nextDouble();
		 n1=n1-n2;
		 n2=n1+n2;
		 n1=n2-n1;
		 System.out.println("RESULT IS="+n1+" AND "+n2);
	 }
 }
 
		 
 //. Write a Java program to print a face.
 
 class q16
 {
	 public static void main(String args[])
	 {
		 System.out.println("  +\"\"\"\"\"+ ");
		 System.out.println("[| o o |] ");
		 System.out.println(" |  ^  | ");
		 System.out.println(" | '_' |  ");
		 System.out.println(" +-----+ ");
	 }
 }
 //Write a Java program to add two binary numbers. 
 class q17
 {
	 public static void main(String args[])
	 {
		 Scanner as=new Scanner(System.in);
		 System.out.println("GIVE TWO NUMBERS");
		 double a1= as.nextDouble();
		double a2=as.nextDouble();
		 double a3= a1+a2;
		 System.out.println("sum of given two number is="+a3);
	 }
 }
 
 //. Write a Java program to multiply two binary numbers
 
 class q18 
 {
	 public static void main(String args[])
	 {
		 Scanner as=new Scanner(System.in);
		 System.out.println("MULTIPLICATION OF GIVEN NUMBER");
		 double a1=as.nextDouble();
		 double a2=as.nextDouble();
		 double a3=a1*a2;
		 System.out.println("MULTIPLICATION OF GIVEN NUMBER IS="+a3);
	 }
 }
 
 
		 
		