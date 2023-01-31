
import java.util.*;
class Item {
	
	int itemId;
	String itemName;
	
	public Item ( int itemId, String itemName )
	{
		this.itemId=itemId;	
		this.itemName=itemName; 
	}
	
	
}

class Itemcomparator implements Comparator <Item>

{
	public int compare (Item c1 ,Item c2)
	{
		if(c1.itemId==c2.itemId)
		{
			return 0;
		}
		else if (c1.itemId > c2.itemId) 
		{
			return 1;
		}
		else
		{
		return -1;
		}
	}
}

class  Main1 {
	
	public static void main (String[] args)
	{
	 ArrayList <Item> c= new ArrayList<Item>();
	c.add(new Item(1, "item1"));
	c.add(new Item(3, "item3"));
	c.add(new Item(1, "item1"));
	c.add(new Item(2, "item2"));
	c.add(new Item(5, "item5"));
	c.add(new Item(4, "item4"));
	c.add(new Item(2, "item2"));


		
Collections.sort( c, new Itemcomparator() );
	
for (Item temp:c)
{
	System.out.println(temp.itemId + " "+ temp.itemName);
}	

	System.out.println("");
	
	System.out.println("After Removing Objects :");
	
	c.remove(1);
	c.remove(3);

	System.out.println("");

for (Item temp:c)
{
	System.out.println(temp.itemId + " "+ temp.itemName);
}	

}	
}