class Employeeid
{
	private String name;//String is wrapper class   when we check equalisation we use equals(); 
	private int age;//int is premitive data type so  when we check equalisation we use ==;,here if we use Integer then we use equals(); method.
	private String gender;
	private int id;
	private double salary;
	
	public Employeeid(String name,int age,String gender,int id, double salary)  
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	this.id=id;
	this.salary=salary;}
	// toString(); method
@Override
public String toString()// method must be public see in javap , datatype must be String, see in javap
{                        // it used for get an meaningful message to mour object or referrence variable
return this.name+" , "+this.age+" , "+this.gender+" , "+this.id+" , "+this.salary;

}
// equals (); method
@Override  // we override to equate two object to check containt is same or not
public boolean equals(Object o)
{
	if(o instanceof Employeeid)
	{
	Employeeid Aj = (Employeeid) o;
	if(
	this.name.equals(Aj.name) && 
	this.gender.equals(Aj.gender) &&
	this.age==Aj.age &&
	this.id==Aj.id &&
	this.salary==Aj.salary
	)
	{
	return true;
	}
} return false;
}
}


class StringDemo
{
   public static void main(String... args)
   {
Employeeid e1=new Employeeid("AKSHAY",25,"MALE",14,70000);
Employeeid e2=new Employeeid("AKANSHA",25,"FEMALE",14,75000);
Employeeid e3=new Employeeid("AKASH",25,"MALE",12,73000);
Employeeid e4=new Employeeid("AKSHAY",25,"MALE",14,70000);
System.out.println(e1);//Employeeid@15db9742
System.out.println(e2);//Employeeid@6d06d69c
System.out.println(e3);//Employeeid@7852e922
System.out.println(e4);//Employeeid@4e25154f  // containt of e1 and e4 are same but different object oso different hashcode more details in hashcode
	System.out.println(e4==e1);// false bcause == represent binary representation of e1 and e4 and both are not same hence answer is false
	System.out.println(e4.equals(e1));//false
	/* String s1=new String("A");
	String s2=new String("A");
	System.out.println(s1==s2);//false bcaus s1 and s2 is create on heap
	System.out.println(s1.equals(s2));//true
   }*/
   }
}

   
	
	