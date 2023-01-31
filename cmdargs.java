class cmdargs
{
	public static void main(String args[])
	{
		String s1=args[0];
		String s2=args[1];
		String s3=args[2];
		
		
		long i= Long.parseLong(s1);
		long j=Long.parseLong(s2);
		long k=Long.parseLong(s3);
		
		System.out.println("Arugument=  "+s1);
		System.out.println("Argument =  "+s2);
		System.out.println("Argument =  "+s3);
		
		System.out.println("Sum=   "+(i+j+k));
	}
};   
