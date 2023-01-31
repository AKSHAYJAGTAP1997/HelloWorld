class MyThread5 extends Thread
{
public void run()
{
 for(int i=0; i<20;i++)
 {
	System.out.println(i+"	-->"+Thread.currentThread().getName()); 
 }
 System.out.println("	sleeping-->"+Thread.currentThread().getName()); 
 try{Thread.sleep(4*1000);}  catch(InterruptedException e){}
 System.out.println("awake	-->"+Thread.currentThread().getName()); 
}
	
}




class JoinDemo2
{
	public static void main(String... args)
	{
		MyThread5 t1=new MyThread5();
		MyThread5 t2=new MyThread5();
		MyThread5 t3=new MyThread5();
		MyThread5 t4=new MyThread5();
		
		
		t1.start();
		//t1.join();// it catch exception   unreported exception InterruptedException;
		try{Thread.sleep(4*1000);}  catch(InterruptedException e){}
		t2.start();
		try{Thread.sleep(5*1000);}  catch(InterruptedException e){}
		t3.start();
		//try{t3.join();}  catch(InterruptedException e){}
		t4.start();
		//try{t4.join();}  catch(InterruptedException e){}
		System.out.println(Thread.currentThread().getName()+"E");
		
	}
	
	
	
	
}

