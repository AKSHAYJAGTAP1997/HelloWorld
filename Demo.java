 class Parent 
{
	int x = 30;
	double y = 34.34;
	double z=78.78;
void m1()
{
System.out.println("CDAC KHARGHAR IS BEST");
}
void m2()
{
	System.out.println("MIKE CHECK");
}
public static void main(String[] args)
{
	Parent p1 =new Child();
	p1.m2();
}


}

  class Child  extends Parent 
{  int x = 20;
double y = 23.23;
int z=90;

{
	System.out.println("AKSHAY JAGTAP");
}
  Child ( ){
	 System.out.println("SUKHWADI");
 }
 

	void m2()
	{
		System.out.println("CDAC JUHU IS BEST");
	}
}


/*class Demo
{
	public static void main(String[] Akshay)
	{
		Child c = new Child();
		c.m2();
		c.m1(); // due to extends word m1() called from parent class but vice versa is not possible
		
		Parent p = new Parent();
		p.m1();
		//p.m2();// when you write Parent extends Child then it will give compile time error:- cyclic inheritance involving Parent
		//p.m2();// COMPILE TIME ERROR (CTE) p.m2() not found
		System.out.println(c.z);// z variable is not found in Child class so it print from Parent class due to"EXTENDS"
		System.out.println("=================");
		//Child p1 = new Parent();
		Parent p1 =new Child();
		System.out.println("-------");
		p1.m2();
		//p1.z=123;// modified value of z from child class  instance cariable are always resolved on reference type
		//System.out.println(p1.z); 
		System.out.println("=================");
		//Child c1 = new Child(89); // instance block and method invoked 
		
		
	}
}


		*/