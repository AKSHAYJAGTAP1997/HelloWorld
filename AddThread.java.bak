class MyThread extends Thread
{
public void run()
{
 for(int i=0; i<20;i++)
 {
	System.out.println(i+"	-->"+Thread.currentThread().getName()); 
 }
}	
	
}



class ThreadDemo
{
	public static void main (String[] args)
	{
		System.out.println(Thread.currentThread().getName()+"started");//main or Main
		
	MyThread t1 = new MyThread();//if Mythread  class has thread class in its hierarchy then object of mythread class is cnsider as thread
	                             // new state
     t1.setName("t1");								 
	MyThread t2 = new MyThread();//new state
	t2.setName("t2");	
	MyThread t3 = new MyThread();//new state
	t3.setName("t3");	
	MyThread t4 = new MyThread();//new state
	t4.setName("t4");	
System.out.println(Thread.currentThread().getName()+"staring thread");


t1.start();
t2.start();
t3.start();
t4.start();
System.out.println(Thread.currentThread().getName()+"ended");

}

}