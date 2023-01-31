class Ds1
{
	static int az=222;
	static int a=123;
	static
	{
		System.out.println("HELLO AKSHAY");
	}
	static void aj()
	{
		System.out.println("SUKHWADI");
	}
}

class Ds2
{//static int aaa=234;
static int aaj=114;
	static void m1()
	{
		System.out.println(Ds1.a);
		Ds1.a=111;
	}
	static void m2()
	{
		System.out.println(Ds1.a);
		Ds1.a=112;
	}
	static void az()
	{
		System.out.println(Ds1.a);
	}
	static int aaa=234;
	
	static double aaz=323;
	public static void main(String[] akshay)
	{
		
		Ds1.aj();
		//System.out.println(aaj);
		System.out.println(Ds1.a);
		Ds2.m1();
		Ds2.m2();
		Ds2.az();
		System.out.println(Ds1.a);
		
}
}


		
