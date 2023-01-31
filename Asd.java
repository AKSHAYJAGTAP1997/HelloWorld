//import java.util.*;
class A
{
	static int aa=10;
	int x=11;
	int y=12;
	static void aj2()
	{
		System.out.println("HELLO AKSHAY");
		
		
	}
	static
		{
			System.out.println("NAMASTE");
		}
	
}

class Asd
{
	static int xx=34;
public static void main (String[] args)
{
   A a=new A();
  // System.out.println(a.aa);
   
   A a1=new A();
   a1=a;
   a1.aj2();
   System.out.println(a1.aa);
   a1.aa=123;
   System.out.println(a.aa);
   a.aa=124;
   System.out.println(a1.aa);
   System.out.println(a1.x);
   System.out.println(a1.y);
   
}
}

	