import java.util.*;

class prime
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER A NUMBER WHICH IS CHECKED FOR PRIME OR NOT");
		int a=sc.nextInt();
		int j=0;
		for(int i=2;i<=a-1;i++)
		{ 
           if(j%i==0)
		   {
               j=j+1;
		   }
		}
     if(j==0)
	 {
        System.out.println();
	 }
   else	
   {
    System.out.println("NUMBER IS not  PRIME");
   }
	}
}
	


		