import java.util.Comparator;

class AdharSort implements Comparator<Person>
{
	public int compare(Person p1, Person p3)
	{
		//return p1.getAdhar().compareTo(p2.getAdhar());// asending order;   output will same if you use p2 or p3
		return p3.getAdhar().compareTo(p1.getAdhar()); // descending order.......
	}
}

	