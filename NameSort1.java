import java.util.Comparator;
class NameSort1 implements Comparator<Person>
{
	public int compare(Person p1, Person p3)
	{
		//return p1.getName().compareTo(p2.getName());// asending order;
		return p3.getName().compareTo(p1.getName()); // descending order
	}
}

	