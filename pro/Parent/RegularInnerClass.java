class Outer
{
	private int x=100;
	
	void m1(){
		System.out.println("INSTANCE method m1 OF CLASS OUTER");
	}
	void m2()
	{
		Outer.Inner I1=this.new Inner();//also u can write Inner I1=new Inner();
		System.out.println("INSTANCE METHOD m2 OF OUTER CLASS");
		System.out.println(I1.y);
		I1.m1();
	}
	
	protected class Inner{
		int y=200;
		
		void m1()
		{
			System.out.println("INSTANCE METHOD  OF CLASS INNER");
			System.out.println(y);
			System.out.println(Outer.this.x);
			Outer.this.m1();
		}
	}
	
			
	
}


class RegularInnerClass
{
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.m2();
		Outer.Inner I=new Outer().new Inner();
		I.m1();
	}
	
}

