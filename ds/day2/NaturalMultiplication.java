class NaturalMultiplication
{
	static int mul( int n)
	{
	if(n==1 || n==0)
	{
		
		return 1;
	}
	
	int mul1=mul(n-1);
	//System.out.println(mul1);
	int mul2=n*mul1;
	System.out.println(mul2);
	
	return mul2;
	

	
}
	
	
	
	
	public static void main(String[] args)
	{
		
		int n=5;
		int ans =mul(5);
		System.out.println("ans ="+ans);
		
	}
	
	
}