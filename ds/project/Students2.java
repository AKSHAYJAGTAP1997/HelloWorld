class Student2 implements Comparable<Student2>
{
	private String name;
	private int RollNo;
	private int Marks;
	


Student2(String name, int RollNo, int Marks)
{

this.name=name;
this.Marks=Marks;
this.RollNo=RollNo;
}

	//get and set methods
	public int getMarks()
	{
		return this.Marks;
	}
	public String getName()
	{
		return this.name;
	}
	
	public int getRollNo()
	{
		return this.RollNo;
	}
	
	public void setMarks(int Marks)
	{
		this.Marks = Marks;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setRollNo(int RollNo)
	{
		this.RollNo = RollNo;
	}
	
	
	
	// tostring method
	@Override
	public String toString()
	{
		return this.name+" ,"+this.Marks+" ,"+this.RollNo;
		
		
	}
	//equals meth
	public boolean equals(Object o)
	{ 
	System.out.println("equals method invoked");
	
	if(o instanceof Student2)
	{
		Student2 p =(Student2) o;
		if (
		this.name.equals(p.name) &&
		this.RollNo==p.RollNo &&
		this.Marks==p.Marks
		)
		{
		return true;	
		}
		}return false;
	}
	
	//hashcode
	public int hashCode()
	{
		System.out.println("hashcode invked");
		
		int ak=20;
		
		ak=ak+ ak*this.name.hashCode();
		ak=(int)(ak*RollNo);
		ak=(int)(ak*Marks);
             return ak;

	}
	
	
	
	public static void main(String... args)
	{
		Student2 p1  = new Student2("AKSHAY jagtap",14,500);
	Student2 p2  = new Student2("DEVI DINESH",36,550);
	Student2 p3 = new Student2("ANIKET PATTIWAR",21,530);
	
	
	System.out.println(p1);
System.out.println(p2);
System.out.println(p3);


	
	
	
}

}


