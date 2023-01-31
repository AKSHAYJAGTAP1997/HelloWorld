class Chain1
{
	double a;
	double b;
	
	
	Chain1(int a,int b)
	{    this.a=a;
	this.b=b;
		int result1=a+b;
		System.out.println("sum of"+a+" and "+b+"is ="+result1);
	}
	Chain1(double a, double b)
	{
		this(100,200);
		this.a=a;
		this.b=b;
		double result = a*b;
		System.out.println("multiplication of"+a+" and "+b+"is ="+result);
	}
}

class Chain
{
public static void main(String[] Akshay)
{
 Chain1 c1=new Chain1(12.12, 13.13);
//Chain1.m2();
System.out.println(c1.a);
System.out.println(c1.b);
}
}

	