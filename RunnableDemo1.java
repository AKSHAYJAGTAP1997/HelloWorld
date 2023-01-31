// comman implement share
class MyRunnable implements unnable
{

@Override 
public void run()
{
for (int i=0; i<20;i++)
{
System.out.println(i+"->"+Thread.currentThread().getName());
}
}
}
	
	class RunnableDemo1
	{
	public static void main(String... args)
	{
   MyRunnable r1 = new runnable();//this is not thread
   Thread t1 = new Thread(r1);//new state
   t1.setName("T1");
   
   Thread t2 = new Thread(r1);//new state
   t2.setName("T2");
   t1.start();
   t2.start();
   
   
   
	}

	
	}
	