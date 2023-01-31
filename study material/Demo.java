class StaticBlock{
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bool;
	
	static{
		
		System.out.println("b before "+b);
		b = 120;
		System.out.println("b after "+b);
		s = 1;
		i = 2;
		l = 3;
		
		f = 0.1f;
		d=0.2d;
		
		c = 'a';
		bool = true;
	}
	
	
}

class A{
	static int p = 10;
	static{
		System.out.println("A:SB");
	}
	
	
}
class Demo{
	
	static void m1(){
		System.out.println("A.p m1()"+A.p);
		A.p = 200;
	}
	static void m2(){
		
		System.out.println("A.p m2()"+A.p);
		A.p=300;
	}
	
	static{
		System.out.println("Demo:SB1");
	}
	static{
		System.out.println("Demo:SB2");
	}
	static{
		System.out.println("Demo:SB3");
	}
	static{
		System.out.println("Demo:SB4");
		System.out.println(StaticBlock.i);
		System.out.println("Demo:SB5");
	}
	static{
		System.out.println("Demo:SB6");
		System.out.println(A.p);
		
	}
	
	public static void main(String[] args){
		System.out.println("main method");
		System.out.println(StaticBlock.i);//2
		
		StaticBlock.i = 10;
		System.out.println(StaticBlock.i);
		
		A.p = 100;
		Demo.m1();
		Demo.m2();
		System.out.println(A.p);
	}
	
	
}