import java.util.LinkedList;
import java.util.Collections;
class LinkedListDemo{
	
	public static void main(String... args){
		LinkedList<String> list3 = new LinkedList<String>();
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
		
		LinkedList<Character> list = new LinkedList<>();
		list.offer('A');
		list.offer('C');
		list.offer('B');
		list.offer('D');
		list.addFirst('E');
		list.add(0,'F');
		Character c = list.peek();// list.peekFirst()
		System.out.println(c);
		System.out.println(list);
		
		c = list.poll(); // list.pollFirst()
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}