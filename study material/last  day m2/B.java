import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner;


public class B {


    public static void main(String [] args) {

		System.out.println("Enter the size of Array");
		Scanner sc =new Scanner(System.in);
		
		int x= sc.nextInt();
		
		int [] arr = new int[x];
		
		for(int i=0; i<x; i++)
		{
			arr [i] =sc.nextInt();
			
		}
		
		System.out.println("enter the index of the array that you want to access");
		int index =sc.nextInt();
		
		try
		{
			
			System.out.println("The Array element at index"+index+"="+ (arr[index]));
			System.out.println("The Array element Successfully accessed");
		
		
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(" java.lang.ArrayIndexOutOfBoundsException");
		}
} 
}