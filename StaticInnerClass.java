class StaticInnerClassDemo
{
	
	static int a=100;
	static void m1(){
		System.out.println("static outer method m1");
	}
	
	 static class InnerClass
	{
		int x=1000;// instance variable of inner class cant be static
		
		static void m2(){
			System.out.println("instance class of inner class");
			System.out.println("instance class of outer class");
			StaticInnerClassDemo.m1();
			System.out.println("instance variable of outer class"+StaticInnerClassDemo.a);
		}
		void m3(){
			System.out.println("m3");
			StaticInnerClassDemo.m1();
		}
		
	}
}

class StaticInnerClass
{
	public static void main(String... args)
	{
		StaticInnerClassDemo.InnerClass I = new StaticInnerClassDemo.InnerClass();
		StaticInnerClassDemo.m1();
		I.m2();
		I.m3();
		System.out.println(I.x);
		//System.out.println(a);
	}
}

