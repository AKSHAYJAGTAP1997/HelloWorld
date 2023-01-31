class Employee
{
	private Integer age;
	private String name;
	private String depart;
	private double salary;
	private int id;
	
public Employee(Integer age,String name,String depart,double salary,int id){
this.age=age;
this.id=id;
this.salary=salary;
this.name=name;
this.depart=depart;
}
//get and set method
//to get smooth output we use toString () method
public String toString()
{
	return this.name+" , "+" , "+this.age+" , "+this.depart+" , "+this.salary+" , "+this.id;
}

// compring to object for equalisation of containt
@Override
public boolean equals (Object o)
{
	if (o instanceof Employee)
	{ 
Employee Aj =(Employee)o;//downcasting
if( this.age.equals(Aj.age) &&
this.name.equals(Aj.name) &&
this.depart.equals(Aj.depart) &&
this.salary==Aj.salary &&
this.id==Aj.id
)
{
	return true;
	}

}return false;// if two object of employee class are equating then true otherwise false
} 

}

class StringDemo1
{
public static void main(String[] args)
{
Employee e1=new Employee(24,"RAVI","PRODUCTION",75000,21);
Employee e2=new Employee(24,"RAVI","PRODUCTION",75000,21);	
Employee e3=new Employee(26,"RAJNIKANT","QUALITY",70000,28);	
Employee e4=new Employee(27,"RAVIKANT","MAINTANANCE",80000,29);	
System.out.println(e1);
System.out.println(e2);
System.out.println(e3);
System.out.println(e4);
System.out.println(e1==e2);
System.out.println(e1.equals(e2));	


}
}

