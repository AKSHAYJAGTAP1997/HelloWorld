import java.util.ArrayList;
import java.util.Collections;
class ListDemko
{
	public static void main(String... args)
	{
	ArrayList<Employee> list = new ArrayList<Employee>();
	Employee e1=new Employee("AKSHAY",24,"MALE","7524UU",1);
		Employee e2=new Employee("RAVI",28,"MALE","7524FF",2);
Employee e3=new Employee("AKSHARA",24,"FEMALE","FR2323",3);
Employee e4=new Employee("AKSHAY",24,"MALE","7524UU",1);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		//list.add(d4);
		System.out.println(list);
		System.out.println(list.contains(e4));
System.out.println(list.indexOf(e4));
Collections.sort(list);
	}
}

	
		