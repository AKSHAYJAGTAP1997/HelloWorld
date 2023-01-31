class Parent
{
	int x=200;
	void m1(int a, int b)
	{
		System.out.println("PARENT : M1");
	}
	
}

class Child extends Parent
{
	int c = 90;
	void m1(int y, int z)
	{
		super.m1(y,z);
		System.out.println("CHILD : M1");
	}
}

class Super
{
	public static void main(String[] args)
	{
		Child c=new Child ();
		c.m1(20,20);
		Parent p=new Parent();
		p.m1(90,90);
		Parent p2 = new Child();
		p2.m1(80,87);
		System.out.println(c.x);
		System.out.println(c.c);
	}
	
}


		
		
