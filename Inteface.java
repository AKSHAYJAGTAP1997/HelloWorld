 interface I1
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}

interface I2 extends I1
{
 void m1()
	{
		System.out.println("interface I2");

	}
}

abstract interface I3 extends I2
{

 void m2()
{
	System.out.println("interface I3:m2");
}

	
}

 class Aj implements   


	