class Akshay
{  static byte i=12;
static short s=34;
static long l=56;
static boolean c=true;
static int a=76;
static float f=78.87f;
static double d=23.333;

static void aksh()
{
	System.out.println("HELLO AKSHAY");
	System.out.println("jagtap");
	s=101;
	System.out.println(s);
	//s=101;
 
}
}




class AkshayDemo
{
	
	
	public static void main(String[] akshay)
	{System.out.println(Akshay.i);
	
	System.out.println(Akshay.s);
	Akshay.s=55;
	System.out.println(Akshay.s);
	System.out.println(Akshay.l);
	System.out.println(Akshay.c);
	System.out.println(Akshay.a);
	System.out.println(Akshay.f);
	//System.out.println(Akshay.d);
	Akshay a=new Akshay();
	//a.aksh();
	a.s=100;
	a.aksh();
	Akshay.i=123;
	System.out.println(Akshay.i);
	}
}



