package pack2;
import pack1.Parent3;

public class Child3 extends Parent3
{
	public static void main(String[] args)
	{
		Child3 c = new Child3();
		c.m1();
//c.m2();  private can not access though outside of class
		c.m3();
		//c.m4();
		System.out.println(c.w);
		//System.out.println(c.x);// private can not access though outside of class
		System.out.println(c.y);
		//System.out.println(c.z);
	}
}


		
