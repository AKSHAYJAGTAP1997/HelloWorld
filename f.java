class factorial
{
	public static void main(String args[])
	{
		int i,fact=1;
		int number=24;
		for (i=1;i<=number;i++)
		{
			fact=fact*i;
		}
	
	System.out.println("FACTORIAL OF "+number+" IS...."+fact);
	}
}
		
		
		class f
		{
			public static void main(String args[]){  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);
  
			}
		}