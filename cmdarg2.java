class cmdarg
{
	public static void main(String args[])
	{
		System.out.println("Argument is....."+args[6]);
	}
}

class cmdarg1
{
	public static void main(String args[])
	{
		String s1=args[0];
		String s2=args[1];
		String s3 =args[2];
		
		System.out.print("ARGUMENT IS....."+s1);
		System.out.print("  . "+s2);
		System.out.print("  . "+s3);
	}
}

class cmdarg2
{
	public static void main(String args[])
	{
		String s1=args[0];
		String s2=args[1];
		String s3=args[2];
		
		int i1=Integer.parseInt(s1);
		int i2=Integer.parseInt(s2);
		int i3=Integer.parseInt(s3);
		
		System.out.println("ANSWER IS= "+(-i1+i2*i3));
	}
}
		
		