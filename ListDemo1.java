import java.util.ArrayList;
import java.util.Collections;

class ListDemo1
{
	public static void main(String... args)
	{
	ArrayList<Person> list =new ArrayList<Person>();
	
	Person p1  = new Person("AKSHAY","789AAKK",24,"MALE");
	Person p2  = new Person("ABHAY","909LLKK",29,"MALE");
	Person p3 = new Person("AKSHAR","1234RREE",25,"MALE");
	Person p4  = new Person("AKSHAY","789AAKK",24,"MALE");
	
	list.add(p1);
	list.add(p2);
	list.add(p3);
	
	Collections.sort(list);
	System.out.println("sorted list"+list);
	
	NameSort1 ns=new NameSort1();
	Collections.sort(list,ns);
	System.out.println("NAMESORT"+list);
	
	AdharSort as=new AdharSort();
	Collections.sort(list,as);
	System.out.println("adhar sorted"+list);
	
	AgeSort ag=new AgeSort();
	Collections.sort(list,ag);
	System.out.println("age sorted   "+list);
	
	
	}
}

	


