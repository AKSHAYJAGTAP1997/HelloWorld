class Windows1
{ int a;
int b;

	
	Windows1 (int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	static void m1(int a,int b)
	{
		
	}
	
	static void m2(Windows1 a,Windows1 b)
	{
		a.a=1000;
		a.b=2000;
		b.a=3000;
		b.b=4000;
		
	}
}

class Windows
{
	public static void main(String[] Akshay)
	{
		Windows1 a1=new Windows1(10,20);
		Windows1 a2=new Windows1(30,40);
		
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a2.a);
		System.out.println(a2.b);
		a2.a=300;
		a2.b=400;
		a1.a=100;
		a1.b=200;
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a2.a);
		System.out.println(a2.b);
		Windows1.m2(a1,a2);
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a2.a);
		System.out.println(a2.b);
	}
}

