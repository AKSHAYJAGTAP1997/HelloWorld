import java.util.HashMap;

class MapDemo
{
	public static void main(String... args)
	{
		HashMap<Integer,Employee> map=new HashMap<>();
	// HAshMap<Key,value> object= new HashMap<>();
		Employee e1 = new Employee(1,"A","Male",10000.0);
		Employee e2 = new Employee(2,"B","Female",50000.0);
		Employee e3 = new Employee(3,"C","Male",20000.0);
		
		map.put(1,e1);
		map.put(2,e2);
		map.put(3,e3);
		System.out.println("before :" +map.get(1));
		Employee e = map.get(1);//get(1) call employee which has id 1 and net line we will updated it
		e.setSalary(70000.0);
			System.out.println("after:" +map.get(1));
		
	}
	
	
}

