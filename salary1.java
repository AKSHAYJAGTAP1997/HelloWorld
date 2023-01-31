class Salary1
{
	
	double basic;
	double da;
	double incent;
	double salary;
	int empid;
	double hour;
	String sp;
	static String department="PRODUCTION";
	
	void setdata( double bas,double d,double inc, int emp,String s,double h)
	{
		this.basic=bas;
		this.da=((d/100)*bas);
		this.incent=((inc/100)*bas);
		//System.out.println("incent"+incent);
		this.salary=(basic+da+incent);
		this.empid=emp;
		this.sp=s;
		this.hour=((h<8)?(salary=salary-100):salary);
		
	}
	void getdata()
	{
		System.out.println("employee id ="+empid);
		System.out.println("EMPLOYEE NAME="+sp);
		System.out.println("gross salary is ="+salary);
		System.out.println("DEPARTMENT  BELONG TO EMPLOYEE IS "+department);
		System.out.println("salary after deduction is ="+hour);
		
		
	}
	public static void main(String args[])
	{
	Salary1 s1=new Salary1();
	Salary1 s2=new Salary1();
	s1.setdata(15000,10,7,100,"AMIT",8);
	s1.getdata();
	s2.department="account";
	s2.setdata(20000,10,7,101,"AMAN",6);
	s2.getdata();
	
	}
}

	
		