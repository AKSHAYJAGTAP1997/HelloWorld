class Sync
{
	synchronized void m1()
	{

	}

synchronized void m2()
{


}	
	
	
	
	
}

class SynchronizedDemo
{
	
	public static void main(String... args)
	{
		Sync s1=new Sync();
		Sync s2=new Sync();
		Thread t1=new Thread()
		{
			public void run()
			{
			s1.m3();	
				
			}
		
		}
	}
	
	Thread t2=new Thread();
	{
		public void run()
		{
			s1.m2();
		}
		
	}
	
	t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		try{Thread.sleep(20);}catch(InterruptedException e){}
		t2.start();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	}