//Byte,Short,Long,Integer --> -128 to 127 (256 objects are in respective pool)
//character = 0-127;
//Boolean =true,false

class WrapperDemo3
{
	public static void main(String... args)
	{
		Integer i1=100;// value of respective pools is in limit so it can create memory on string pool
		Integer i2=100;//value of respective pools is in limit so it can create memory on string pool
		System.out.println(i1==i2);//true 
		System.out.println(i1.equals(i2));//true
		
		Integer i3=1000;//value of respective pools is above limit so it can create memory on heap
		Integer i4=1000;//value of respective pools is above limit so it can create memory on heap
		System.out.println(i3==i4);//false, we cant reuse i3 and i4//== check reference of object
		System.out.println(i3.equals(i4));//equals check contain of object
		
		
		Integer i5=new Integer(100);//createon heap memory
		System.out.println(i1==i5);//so it became false
		System.out.println(i1.equals(i5));//true  bcause it check containt of object
	}
}

	


		