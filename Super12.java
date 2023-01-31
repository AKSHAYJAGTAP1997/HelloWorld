class Parent
{
	{
		System.out.println("inhit block of parent");
	}
	Parent()
	{
		System.out.println("constructer 1");
	}
	Parent(int a)
	{ 
		System.out.println("constructor2");
	}
}

class Child1 extends Parent
{
	{//super.inhit of parent class of child1 call by java
		System.out.println("inhit block of child1");
	}
	Child1()
	{
	//super.constructor of parent class of child1 call by java
		System.out.println("constructer child1");
	}
	Child1(int a)
	{ 
		System.out.println("constructor  of  child1");
	}
}

	
	class Child2 extends Child1
{
	{ //super.inhit of parent class of child2 call by java
		System.out.println("inhit block of child2");
	}
	Child2()
	{ //super.constructor of parent class of child2 call by java
		System.out.println("constructer child2");
	}
	Child2(int a,int b)
	{
		System.out.println("constructor  of child2");
	}
}

class Super12
{
	public static void main(String[] arts)
	{
		Child2 c =new Child2();
	}
	
}




	