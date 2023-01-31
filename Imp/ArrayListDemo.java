import java.util.ArrayList;
class ArrayListDemo
{
	public static void main(String... args)
	{
		ArrayList list = new ArrayList(); //non generic collection
		list.add(10);
		list.add(200);
		list.add(0,100);
		list.add(1000);
		list.add(new Double("20.0"));
		list.add(null);
		
		
		System.out.println(list.size());
        System.out.println(list.get(0));
System.out.println(list.get(1));
System.out.println(list.get(2));
System.out.println(list.get(3));
System.out.println(list.get(4));
System.out.println(list.get(5));


ArrayList<Integer> list1 = new ArrayList();//Integer type Arraylist...you can create other wrapper class list also	
	ArrayList<Integer> list1 = new ArrayList<Integer>();// before java 6 you can write ike this but after that you can write following way
	ArrayList<Integer> list1 = new ArrayList<>();
	}
}

	
			