class A
{ int h=100;
	public void m1(int a,int b)
	{
		System.out.println("A::M1()");
	}
	
	void m2(int a)
	{
		System.out.println("A::M2()");
	}
	
	protected void m3(String s)
	{
		System.out.println("A::m3()");
		
	}
	
	
	
}

class B extends A
{    int h=10;
	public void m1(int a,int b)
	{
		System.out.println("B::M1()");
	}
	@Override
	public void m3(String s)
	{
		System.out.println("b::m3()");
	}
	//m2() is not override bcause arg type is different
      public void m2(int a)
	{
		System.out.println("B::M2()");
	}
	
}

class Overriding
{
	public static void main(String... Akshay)
	{
		A a = new B();
		
		a.m1(10,12);
		a.m2(12);//12 is by dwfault int type so here m() from class A is called
		
		a.m3("akshay");
		System.out.println(a.h);
}

}

