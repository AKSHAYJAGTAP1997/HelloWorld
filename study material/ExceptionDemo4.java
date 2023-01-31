import java.io.*;
class A{
	void m1()throws IOException{
		Class.forName("ABCD.class");
	}
}

class B extends A{
	
	@Override
	void m1()throws NullPointerException{
		
	}

}

class ExceptionDemo4{
	public static void main(String[] args){
		A a = new A();
		//a.m1();
	}
}