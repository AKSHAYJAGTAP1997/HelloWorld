class A
{
	public static void m1()
	{
		System.out.println("m1():A");
	}
}

class B extends A
{
	public static void m1()
	{
		System.out.println("m1():b");
	}
}

class Wq
{public static void main(String[] aj)
	{
		A.m1();
		B.m1();
	}
}

	