class PassByValue{
	int a;
	int b;
	
	PassByValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	
	static void add(int x, int y){
		
	}
	
	static void m1(PassByValue o1, PassByValue o2){
		o1.a = 100;
		o1.b = 200;
		o2.a = 300;
		o2.b = 400;
	}

}


class PassByValueDemo{

	public static void main(String... args){
		PassByValue oa1 = new PassByValue(10,20);
		PassByValue oa2 = new PassByValue(30,40);
		
		System.out.println("oa1.a : "+oa1.a +", oa1.b : "+oa1.b);
		System.out.println("oa2.a : "+oa2.a +", oa2.b : "+oa2.b);
		
		PassByValue.m1(oa1,oa2);
		
		System.out.println("oa1.a : "+oa1.a +", oa1.b : "+oa1.b);
		System.out.println("oa2.a : "+oa2.a +", oa2.b : "+oa2.b);
	}
}