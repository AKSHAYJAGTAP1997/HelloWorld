class Demo
{
	private int x;
	private double y;
	private Integer z;
	private String name;
	private String id;
	
	public  Demo(int x, double y, Integer z, String name, String id)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.name=name;
		this.id=id;
	}
	public String toString()// this is an optional
	{
		return this.name+","+this.id;
		
	}
	
	
}

class DemotoString
{
	public static void main(String... args)
	{
		Demo d1= new Demo(12,23.23,32,"AKSHAY","production");
		Demo d2= new Demo(13,34.34,33,"AKSHAYaa","quality");
		Demo d3= new Demo(14,45.56,34,"AKSH","maint.");
		Demo d4= new Demo(12,23.23,32,"AKSHAY","production");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		/*Demo@15db9742
Demo@6d06d69c
Demo@7852e922
Demo@4e25154f*/
	}
}


		