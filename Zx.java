class Zxdemo
{
	int a,b;
	 Zxdemo(int a, int b)
	 {
		 this.a=a;
		 this.b=b;
	 }
	 
	 static void m1(Zxdemo x1,Zxdemo x2)
	 {
		 x1.a=300;
		 x1.b=400;
		 x2.a=800;
		 x2.b=900;
		 
	 }
	 void m2(Zxdemo x2)
	 {
		 this.a=444; 
		 this.b=555;
		 x2.a=a;
		 x2.b=b;
		 
	 }
}

class Zx
{
	public static void main(String[] Akshay)
	{
		Zxdemo zx=new Zxdemo(10,20);
		Zxdemo zx1=new Zxdemo(30,40);
		
		System.out.println(zx.a+"-----"+zx.b);
		System.out.println(zx1.a+"-----------"+zx1.b);
		
		Zxdemo.m1(zx,zx1);
		System.out.println(zx.a+"-----"+zx.b);
		System.out.println(zx1.a+"-----------"+zx1.b);
		
		zx.m2(zx1);
		System.out.println(zx.a+"-----"+zx.b);
		System.out.println(zx1.a+"-----------"+zx1.b);
		
		
		
		
		
		
		
	}
}


		
	 
	 