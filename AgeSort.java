import java.util.Comparator;
class AgeSort implements Comparator<Person>
{
	public int compare(Person p1,Person p2)
	{
		//return p1.getAge()-p2.getAge();//asending order
		return p2.getAge()-p1.getAge(); // descending order
	}
}
