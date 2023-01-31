import java.util.Comparator;
class SalarySort implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		//return e1.getSalary().compareTo(e2.getSalary());//asending order
		return e2.getSalary().compareTo(e1.getSalary()); // descending order
	}
}
