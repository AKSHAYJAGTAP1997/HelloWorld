class Constructor
{
	double a;
	double b;
	Constructor(int a, int b)
	{ this(12.22,14.22);//try to call second constructor
		this.a=a;
		this.b=b;
	int	result=a+b;
		System.out.println("Sum of "+a+" & "+b+" is ="+result);
	}
	
	Constructor (double a, double b)
	{
		this.a=a;
		this.b=b;
		double result1=a*b;
		System.out.println("Multiplication of "+a+" & "+b+" is ="+result1);
	}
	
	
}

class ConstructorDemo
{
	
	public static void main(String[] akshay)
	{
		Constructor c=new Constructor(10,20);
		c.a=100;
		c.b=200;
		//c.Constructor();
		//System.out.println(c.Constructor);
		System.out.println(c.a);
		System.out.println(c.b);
		//Constructor c1=new Constructor(10.10,20.20);
	}
}

		
		
		
	
		
		