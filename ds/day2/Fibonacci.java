//Using Recursion
import java.util.*;
public class Fibonacci{
	public static int fibonacciRecursion(int a,int b, int n){
	if(n == 0){
		return 0;
	}
	int c=a+b;
	System.out.print(c+" ");
	return fibonacciRecursion(b,c,n-1);
	
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	System.out.print("enter first number of fabinico ");	
	int a=sc.nextInt();
	System.out.print("enter second number of fabinico ");
	int b=sc.nextInt();
	System.out.print("enter first n number for fabinico ");
	int n=sc.nextInt();

	
	System.out.print(a+" ");
	System.out.print(b+" ");
	fibonacciRecursion(a,b,n-2);
	
}

}

