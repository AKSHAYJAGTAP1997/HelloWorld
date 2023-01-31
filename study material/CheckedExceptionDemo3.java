import java.io.*;
class CheckedExceptionDemo3{
	static void m2()throws FileNotFoundException {
		
	}
	static void m1()throws ClassNotFoundException,FileNotFoundException{
		m2();
	}
	static void m()throws NullPointerException,ClassNotFoundException{
		try{
			m1();
		}catch(FileNotFoundException e){
			
		}
	}
	
	public static void main(String[] args)throws Throwable{
		m2();
		m1();
		m();
	}
}
