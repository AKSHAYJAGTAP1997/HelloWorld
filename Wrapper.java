class WrapperClass
{
	public static void main(String[] args)
//how to convert something into wrapper class
	{
		Integer a1=new Integer(10);//first method to convert string to primitive datatype 
		Integer a2=new Integer("10");//constructor type
		System.out.println(a1);
		System.out.println(a2);
		
		Integer a3=Integer.valueOf("20");// second method of converting string to premitive
		 Integer a4=Integer.valueOf("1111",2);
		 System.out.println(a3);
		 System.out.println(a4);
		 
		 short x=20;// here create variabke od short & assign in Short object
		 Short s1=new Short(x);//at this line default value of x is in int .
		 System.out.println(s1);
		 
		
		 Byte b1=new Byte((byte)134);// like this also we assign byte value
		 Byte b2 =new Byte ("90");
		 System.out.println(b1);
		 System.out.println(b2);
		 
		 //Byte b3 =new Byte ("asdfg");//.NumberFormatException: For input string: "asdfg"
		 
		 //System.out.println(b3);// it will give run time error
		 
		 
		 
	}
}

class Wrapper
{
//how to convert wrapper class into something

public static void main(String[] args)
{
	int x=Integer.parseInt("10");
	double y=Double.parseDouble("12.3");//first type called parse method
	
	System.out.println(x);
	System.out.println(y);
	
		Integer i1=new Integer("135");
		
		byte b2=i1.byteValue();
		long l2=i1.longValue();//meaning-byte class has longValue method which convert value in b object into long
		System.out.println(b2);
		System.out.println(l2);
}
}

