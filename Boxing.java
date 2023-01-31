class Boxing
{
	public static void main(String[] akshay)
	{
	//boxing or Autoboxing
	// converting primitive to wrapper class object
	Integer i1=10;
	//step 1 : int --> Integer
	// step2: Integer == Integer
	System.out.println(i1);
	//unboxing or autoUnboxing
		// converting wrapper class object to primitive
		int i=i1;
		//step1:Integer--> int
		//step2: int=int
		System.out.println(i);   //   object
                                //    |		
		                      //    number
		                      //   /       \
		byte b= 10;          //   /         \
		Integer i2=b;// CTE       //  integer   byte  values of i2 is only 2 values 1.null 2.new Integer
		//byte-> Byte
		// Integer-> Byte
	
	
	short h=12;
	Integer i3=h;//CTE
	// short-> Short
	// Integer=Short
}
}
/*
class Unboxing extends Boxing
{
	public static void main(String[] args)
	{
		//unboxing or autoUnboxing
		// converting wrapper class object to primitive
		int i=i1;
		System.out.println(i);
		{
			
		}
		
	}
}*/


		