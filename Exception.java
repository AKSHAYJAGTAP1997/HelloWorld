class Demo
{
	static void m1(){
		m2();
	}
	static void m2(){
		m1();
	}
	
public static void main(String[] args)
{
m1();//recursion occur heap memory full get error, name stack overflow error
System.out.println("reached here");//it does not get memory to run
}
}

