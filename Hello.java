class Hello2
{
	private final void BaapHoon()
	{
	System.out.println("Niche dekho");	
	}
	
	
}
  



public class Hello extends Hello2
{
      	
	public final void BaapHoon()
	 {
		 System.out.println("Upar dekho");
		 
	 }
	public static void main(String[] args)
	{
		new Hello().BaapHoon();
	}
	
	
}