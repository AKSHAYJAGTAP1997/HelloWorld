/* 
Write a class MathOperation which accepts integers from command line. Create an array using these parameters. 
Loop through the array and obtain the sum and average of all the elements. Display the result. 
Check for various exceptions that may arise like ArMaithmeticException, NumberFormatException, and so on.
 For example: The class would be invoked as follows: C:>java MathOperation 1900, 4560, 0, 32500
*/
import java.util.Scanner;
import java.lang.NumberFormatException;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

class MathOperation
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int x = args.length;
	int [] a=new int[x];
	int sum=0;
 double avrg=0;
try{	
for (int i=0;i<x;i++) 
           {
			a[i] = Integer.parseInt(args[i]);
			}
	for (int i=0;i<x;i++)
	{
		sum+=a[i];
		avrg=sum/x;
		
	}
	
	System.out.println("Sum of all no :"+ sum);
	System.out.println("Average of all no :"+ avrg);
}
catch(ArrayIndexOutOfBoundsException b){System.out.println(b);}


		
		
		
	}
	
}