import java.util.Vector;
import java.util.Collections;
class VectorDemo{
	public static void main(String... args){
		
		Vector<String> list3 = new Vector<String>();
		list3.add("A");
		list3.add("B");
		list3.add("C");
		list3.add(3,"D");
		//list3.add(6,"E");// IndexOutOfBoundsException
		list3.add("E");
		list3.add("F");
		list3.add("F");
		
		list3.remove(0);
		list3.remove("D");
		list3.remove(new String("D"));
		System.out.println(list3);
		
		System.out.println(list3.indexOf("L"));//-1
		System.out.println(list3.lastIndexOf("F"));
		
		System.out.println(list3.contains("F"));
		for(String s:list3){
			System.out.println(s);
		}
		
		//static utility
		Collections.sort(list3);
		System.out.println(list3);
		
		
		
		
	}
}