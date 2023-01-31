import java.util.Comparator;
class NameSort implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		//return e1.getName().compareTo(e2.getName());// asending order;
		return e2.getName().compareTo(e1.getName()); // descending order
	}
}

	