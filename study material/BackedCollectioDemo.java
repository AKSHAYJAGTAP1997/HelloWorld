import java.util.TreeSet;
import java.util.SortedSet;
class BackedCollectioDemo{

	public static void main(String... args){
		TreeSet<Integer> set = new TreeSet<Integer>();//Sorted
		set.add(60);
		set.add(50);
		set.add(40);
		set.add(20);
		set.add(30);
		set.add(30);
		set.add(10);
		set.add(10);
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		SortedSet<Integer> set2 = set.headSet(30);
		System.out.println(set2);
		
		set.add(25);
		System.out.println("Set : "+set);
		System.out.println("Backed Set : "+ set2);
		
		set2.add(26);
		System.out.println("Set : "+set);
		System.out.println("Backed Set : "+ set2);
		
		//set2.add(35);
		set.add(35);
		System.out.println("Set : "+set);
		System.out.println("Backed Set : "+ set2);
		
		SortedSet<Integer> set3 = set.tailSet(30);// >= 30
		//WAP 
		
		SortedSet<Integer> set4 = set.subSet(20,30);// >=20   but < 30
		//WAP
		
	}
}