class WrapperDemo2
{
	static void m1(int i)
	{
		System.out.println("1");
	}
	static void m1(byte b)
	{
		System.out.println("2");
	}
	static void m2(int i)
	{
		System.out.println("1");     // widening is happen
	}
	
	static void m2(byte... b)
	{
		System.out.println("2"); // variable argument
	}
	static void m3(int i)
	{
		System.out.println("1");//widening 
	}
	static void m3(Byte b)
	{
		System.out.println("2");// boxing
	}
	static void m4(byte... b)
	{
		System.out.println("1");//var args occur
	}
	static void m4(Byte b)
	{
		System.out.println("2");//boxing occur
	}
	static void m5(int... i)
	{
		System.out.println("a");//widening with var args
	}
	static void m5(Byte b)
	{
		System.out.println("b");//boxing
	}
	static void m6(int i)
	{
		System.out.println("a");//widening 
	}
	static void m6(Byte... b)
	{
		System.out.println("b");//boxing with var args
	}
	
	
	
	
	
	public static void main(String[] args)
	{
byte b=10;//here b is byte type so m1 at 7 line is called  
		m1(b);// 2 output
		byte b2=10;// in widening and var args , widening is aklways preffered
		
		m2(b2);//so output 1
		
		byte b3=10;
		m3(b3);// widening and boxing occurs then it will preffer widening
	            // output 1
	     byte b4=10;//boxing and var args occur at same time then it preffer boxing
		 m4(b4);//so output 2
	    
		byte b5=10;// widening with var args and boxing is occur at same time then it preffer boxing and vice versa.
		m5(b5);//so output = b;
		
		byte b6=10;
		m6(b6);
	
	
	}
}

