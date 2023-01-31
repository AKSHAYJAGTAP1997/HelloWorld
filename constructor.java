import java.util.*;

class Constructor
{int x;
double y;
double z;
	Constructor()
	{
		this("AKSHAY");
		System.out.println("ANIL JAGTAP");
		
	}
	Constructor(String s)
	{
		//this.x=x;
		//this.y=y;
		
		System.out.println("SUKHWADI");
	}
	
	Constructor(int x,double y, double z)
	{
		System.out.println("sum is ="+(x+y+z));
	}
	public static void main(String args[])
	{
		Constructor c=new Constructor();
		Constructor c1=new Constructor(2,2.22,2.222);
		
		
	}
}

