import java.util.*;

class Test1{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		
		int reverse=0, rem,temp;
		
		temp=n;
		
		while(temp!=0)
		{
			rem=temp%10;
			reverse=reverse*10+rem;
			temp/=10;
		}
		
		//System.out.println("Reverse number"+reverse);
		
		if(n==reverse)
			System.out.println(n+" is palidrome number");
		
		else
			System.out.println(n + " is not palidrome number");
		
		
	}
	
	
	
}