import java.util.TreeSet;
class SetDemo
{
	public static void main(String... args)
	{
		TreeSet<Employee> set =new TreeSet<>();//treeset used for uniqueness and sorting and by default sorting on gender in employee class(compare to gender kiya hai isiliye)
	    Employee e1 = new Employee(3,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(1,"C","Male",20000.0);
		//Employee e4 = new Employee(1,"A","Male",10000.0);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
	System.out.println(set);//by default gender sort // tree set ka kaam hai at the time insersion sort krnna

NameSort ns=new NameSort();
TreeSet<Employee> set2 =new TreeSet<>(ns);//treeset used for uniqueness and sorting and by default sorting on gender in employee class(compare to gender kiya hai isiliye)
	   set2.add(e1);
		set2.add(e2);
		set2.add(e3);
		System.out.println(set2);
		
		SalarySort ss=new SalarySort();
TreeSet<Employee> set3 =new TreeSet<>(ss);//treeset used for uniqueness and sorting and by default sorting on gender in employee class(compare to gender kiya hai isiliye)
	    
		set3.add(e1);
		set3.add(e2);
		set3.add(e3);
		System.out.println(set3);
	}
}

