class Cricket
{
	int a;
	int age;
	String skill;
	String name;
	static String game="CRICKET";
	
	void setdata( int aj, int ag,String sk,String nam)
	{
		this.a=aj;
		this.age=ag;
		this.skill=sk;
		this.name=nam;
		
		
		
	}
	void getdata()
	{
		System.out.println("jursey no="+a);
		System.out.println("Age="+age);
		System.out.println("skill are ="+skill);
		System.out.println("name "+name);
		
		
	}
	public static void main(String args[])
	{
	Cricket p1=new Cricket();
	Cricket p2=new Cricket();
	Cricket p3=new Cricket();
	Cricket p4=new Cricket();
	Cricket p5=new Cricket();
	p1.setdata(01,32,"bowler","IRFAN");
	p1.getdata();
	
	p2.setdata(22,33,"batsman","AMAN");
	p2.getdata();
	p3.setdata(33,44,"batsman","salman");
	p3.getdata();
	p4.setdata(21,23,"all rounder","ali");
	p4.getdata();
	p5.setdata(20,24,"batsman","kalam");
	p5.getdata();
	
	}
}

	
		