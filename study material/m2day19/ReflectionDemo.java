import java.lang.reflect.*;
class A{
	int x;
	int z;
	private int y;
	static{
		System.out.println("static block invoked");
	}
	A(){
		System.out.println("Constructor invoked");
	}
	void m1(){
		System.out.println("m1() invoked");
	}
	
	private void m2(){
		System.out.println("m2() invoked");
	}
	
	private void m3(int a){
		System.out.println("m3() invoked");
	}

}

class ReflectionDemo{
	public static void main(String[] args)throws ClassNotFoundException, InstantiationException,
		IllegalAccessException,NoSuchMethodException, InvocationTargetException
	{
		Class aClass = Class.forName("A");// load A and return Class<A> object
		
		Field[] fields = aClass.getDeclaredFields();
		for(Field f : fields){
			System.out.println(f.getName());
		}
		
		Method[] methods = aClass.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m.getName());
		}
		
		//A a = new A();
		
		A a = (A) aClass.newInstance();// Create new object without using new keyword
		//a.m1();
		Method m1 = aClass.getDeclaredMethod("m1");
		m1.invoke(a);
		
		// to invoke a private method outside the class
		Method m2 = aClass.getDeclaredMethod("m2");
		m2.setAccessible(true);// for private methods accessible = false
		m2.invoke(a);
		
		//print m2 ka Access Modifier 
		// Google
		//m2.get
	}
}

// Class<A>