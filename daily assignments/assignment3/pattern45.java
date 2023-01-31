class pattern45

{
	public static void main(String args[])
	{
		for( int i=5;i>=1;i--)
		{
			
			char a=65;
			for(int j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				a++;
			}
			
			System.out.println();
		}
	
	}
}