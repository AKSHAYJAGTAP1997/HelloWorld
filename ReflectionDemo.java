import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;


class Akshay
{
int x;
int y; 
private int z;

static
{
	
System.out.println("static block invoked");	
	
}

Akshay()
{
	System.out.println("constructor invoked");
}

private void m1()
{
System.out.println("method m1 invoked");
}	
	private void m2(int z)
	{
		System.out.println("method m2 invoked");
		
	}
	
void m3()
{
System.out.println("method m3 invoked");
}
	
	
	
}

class ReflectionDemo
{
	public static void main(String[] arg) throws ClassNotFoundException, InstantiationException , NoSuchMethodException, IllegalAccessException,InvocationTargetException,NoSuchMethodException
	{ 
	 Class aj=Class.forName("Akshay");
	 Field[] fields = aj.getDeclaredFields();// reflect variable in output  // firstly through classnot found exception
		for(Field f : fields){
			System.out.println(f.getName());
		}
		
	Method[] methods = aj.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m.getName());
		}
		
		
		
		Constructor[] c=aj.getDeclaredConstructors();
		for(Constructor c1: c)
		{
			System.out.println(c1.getName());
		}
		
		
		Akshay a = (Akshay) aj.newInstance();// Create new object without using new keyword
		//a.m1();
		Method m3 = aj.getDeclaredMethod("m3");
		m3.invoke(a);
		
		
		Method m2 = aj.getDeclaredMethod("m2");
		m2.setAccessible(true);// for private methods accessible = false
		m2.invoke(a);
	}
	
	
}



