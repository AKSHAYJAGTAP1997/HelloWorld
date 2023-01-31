class A{}
class B extends A{}



class ClassCaste
{
	public static void main(String[] args)
	{
		System.out.println("before");
		A a=new A();
		try
		{
			B b=(B)a;
		}
		catch(ClassCastException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("invalid downcasting");
			System.out.println("ref cant be parent class");
		}
		System.out.println("after");
	}
}

