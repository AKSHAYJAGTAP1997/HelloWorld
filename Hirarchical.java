class Parent
{
	int x = 10;
	void m1()
	{
		System.out.println(" A::m1");
}
}


class Child1 extends Parent
{
	int y=20;
	void m2()
	{
		System.out.println("B::m2()");
	}
	
}

class Child2 extends Parent
{
	int k=30;
	void m3()
	{
		System.out.println("c::m3()");
	}
	
	
}

class Hirarchical
{
	public static void main(String[] args)
	{
		Parent p1 = new Parent();
		
		p1.m1();//A::M1()
		System.out.println(p1.x);//10
		
		Child1 c1= new Child1();
		c1.m1();//A::M1()
		c1.m2();//B::M2()
		System.out.println(c1.x);//10
		System.out.println(c1.y);//20
		
		Child2 c2 =new Child2();
		c2.m1();//A::M1()
		c2.m3();//B::M2()
		System.out.println(c2.x);//10
		System.out.println(c2.k);//30
		
}

}

