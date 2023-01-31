import java.util.Comparator;
class GenderSort implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		//return e1.getGender().compareTo(e2.getGender());//asending order
		return e2.getGender().compareTo(e1.getGender()); // descending order
	}
}
