class Typecasting
{
	public static void main(String args[])
	{
		// upcasting
		int i= 143;
		float f= i;
		System.out.println(i);
	System.out.println(f);
	
	
	float i1= 143.143143F;
	double f1=i1;
	System.out.println(i1);
	System.out.println (f1);
	
	
	int i3=143;
	long f3=i3;
	System.out.println(i3);
	System.out.println(f3);
	
	//DOWNCASTING
	
	double i4=143.14314314322;
	float f4= (float)i4;
	System.out.println(i4);
	System.out.println(f4);
	
	
	double i5=143.14322564542524356;
	int f5= (int)i5;
	System.out.println(i5);
	System.out.println(f5);
	
	short i6= 9595;
	byte f6=(byte) i6;
	System.out.println(i6);
	System.out.println(f6);
	
	
	
	char i7='A';
	byte f7=(byte)i7;
	System.out.println(i7);
	System.out.println(f7);
	
	char i8='a';
	byte f8=(byte)i8;
	System.out.println(i8);
	System.out.println(f8);
	}
}