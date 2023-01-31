package packageB;
public class D
{
	public static double w=12.23;
	//protected static double x=23.34;// it is protected so it is allow for same package only not for different package
	//static double  y=34.45;//it is default so it is allow for same package only not for different package
	//private double z=45.56;//it will allow only in this class bcause it is private
	public static void m5()
	{
		System.out.println("team 2 kh");
	}
	
	/*protected static void m6()// it will allow only in this class bcause it is protected
	{
		System.out.println("team 3 kh");
	}
	static void m7()//it is default so it is allow for same package only not for different package
	
	{
		System.out.println("team 4 kh");
	}*/
	
	public static void main(String[] Akshay)
	{
		System.out.println(w);
		//System.out.println(x);
		//System.out.println(y);
		m5();
		//m6();
		//m7();
	}
}

		
		