/* 
Write a class MathOperation which accepts integers from command line. Create an array using these parameters. 
Loop through the array and obtain the sum and average of all the elements. Display the result. 
Check for various exceptions that may arise like ArMaithmeticException, NumberFormatException, and so on.
 For example: The class would be invoked as follows: C:>java MathOperation 1900, 4560, 0, 32500
*/

import java.lang.NumberFormatException;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

//import java.io.*;

class MathOperation1{
	
public static void main(String[] args) {

int n = args.length;
int [] arr = new int[n];

int sum=0;
double avg=0;


try {
for (int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(args[i]);
}
	for (int i=0;i<n;i++)
	{
		sum+=arr[i];
		avg=sum/n;
		
	}
	
	System.out.println("Sum of all no :"+ sum);
	System.out.println("Average of all no :"+ avg);
} catch (NumberFormatException e) {
	System.out.println("xyz");
}
catch (ArithmeticException e) {
	System.out.println("abc");
}
catch (InputMismatchException e) {
	System.out.println("nmo");
}
}


}


