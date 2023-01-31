class AddThread extends Thread
{
public void run()
{System.out.println("	-->"+Thread.currentThread().getName() +"add started"); 
 int sum=0;
 for(int i=0; i<20;i++)
 {
	sum+=i;
 }System.out.println("	-->"+Thread.currentThread().getName()+"add ended"+sum); 
}	
	
}


class MulThread extends Thread
{
	MulThread(String name)
	{
		super(name);
		
	}
	MulThread(){}
public void run()
{System.out.println("	-->"+Thread.currentThread().getName()+"stared mul");
int mul=1; 
 for(int i=1; i<20;i++)
 {
	mul*=i;
 }System.out.println("	-->"+Thread.currentThread().getName()+"mul ended"+mul); 
}	
	
}

class RunnableDemo2
	{
	public static void main(String... args)
	{
   AddThread r1 = new AddThread();//this is not thread
   Thread t1 = new Thread(r1,"T1");//new state
  // t1.setName("T1");
    MulThread r2 = new MulThread();
   Thread t2 = new Thread(r2,"T2");//new state
  // t2.setName("T2");
   t1.start();
   t2.start();
   
	}
	}
	
	