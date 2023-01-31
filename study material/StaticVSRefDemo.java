
class A{
	int x=10;
	int y=20;
	
	static int a=100;
	
	void m1(){
		System.out.println(x);//100
		System.out.println(y);//2000
		System.out.println(A.a);//100
		
	}
	
	static void m3(){
		//System.out.println(x);
		//System.out.println(y);
		System.out.println(A.a);
	}
}


class StaticVSRefDemo{
	public static void main(String[] args){
		A a = new A();
		a.m1();
		
		A a2 = new A();
		A a3 = new A();
		a2.x = 100;
		a2.y = 200;
		//a2.m1();
		
		//A.m3();
		
		a2.m3(); // JVM will treat this line as A.m3(); bcoz m3 is a static method
		//A.m3(); // A.m3();
		//a3.m1();
		
		
		
	}
	
}