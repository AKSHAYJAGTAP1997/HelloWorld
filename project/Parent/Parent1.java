 package Akshay;

class Parent1
{
	
	
	public static void m1()
	{
		System.out.println("parent class m1");
	}
	
	public static void main(String[] args)
	{
		Parent p=new Parent();
         p.m1();
System.out.println("which m1 called??");
	m1();}
}

	