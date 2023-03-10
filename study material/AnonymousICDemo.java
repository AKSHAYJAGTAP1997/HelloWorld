interface I1{
	void m2();
	void m3();
	void m4();
}

interface I2{
	void m5();
	void m6();
}

class Parent{

	void m1(){
		System.out.println("Parent:m1()");
	}
}

class AnonymousICDemo{
	public static void main(String[] args){
		Parent p = new Parent(){
			@Override
			void m1(){
				System.out.println("Child:m1()");
			}
		};
		
		I1 i = new I1(){
			
			@Override
			public void m2(){
				System.out.println("Child:m2()");
			}
			
			@Override
			public void m3(){
				System.out.println("Child:m3()");
			}
			
			@Override
			public void m4(){
				System.out.println("Child:m4()");
			}
		};
		
		p.m1();
		i.m2();
		i.m3();
		i.m4();		
		
		I2 i2 = new I2(){
			@Override
			public void m5(){
				System.out.println("Child:m5()");
			}
			
			@Override
			public void m6(){
				System.out.println("Child:m6()");
			}
			
		};
		
		i2.m5();
		i2.m6();
		
	}
}