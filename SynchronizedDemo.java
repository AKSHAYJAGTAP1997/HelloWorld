class Sync
{
	synchronized void m1()
	{
System.out.println(Thread.currentThread().getName()+" m1 started()");
//try{Thread.sleep(4*1000);}catch(InterruptedException e){}

System.out.println(Thread.currentThread().getName()+"m1 ended()");
	}

synchronized void m2()
{

System.out.println(Thread.currentThread().getName()+"m2 started()");

System.out.println(Thread.currentThread().getName()+"m2 ended()");
}
 
 
 void m3()//non synchronized non static method
{
System.out.println(Thread.currentThread().getName()+"m3 started()");
//try{Thread.sleep(4*1000);}catch(InterruptedException e){}
System.out.println(Thread.currentThread().getName()+"m3 ended()");
}



static void m4()
{
System.out.println(Thread.currentThread().getName()+"m4 started()");
try{Thread.sleep(4*1000);}catch(InterruptedException e){}

System.out.println(Thread.currentThread().getName()+"m4 ended()");
}	
	
synchronized static void m5()
{
System.out.println(Thread.currentThread().getName()+"m5 started()");
try{Thread.sleep(4*1000);}catch(InterruptedException e){}

System.out.println(Thread.currentThread().getName()+"m5 ended()");
}	
	
	
}

class SynchronizedDemo
{
	
	public static void main(String[] args)
	{
		Sync s1=new Sync();
		Sync s2=new Sync();
//senario1--> m1 of t1 and m1 of t2	
	/*Thread t1=new Thread(){
			public void run()
			{
			s1.m2();	
				
			}
		
		};
	
	
	Thread t2=new Thread(){
		public void run()
		{
			s1.m2();
		}
		
	};
	
	t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		try{Thread.sleep(20*100);}catch(InterruptedException e){}
		t2.start();
		*/     // for this m2 of t1 start and end first then m2 of t2 start and end
		// bcause s1 is locked by t1 as soon as t1 release s1 then and then onlt s1.m1() of t2 exicuted
		
		
		// 2 senario   s1.m1() of t1 and  s1.m2() of t2
		
	/*
		Thread t1=new Thread(){
			public void run()
			{
			s1.m1();	
				
			}
		
		};
	
	
	Thread t2=new Thread(){
		public void run()
		{
			s1.m2();
		}
		
	};
	
	t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		try{Thread.sleep(20*100);}catch(InterruptedException e){}
		t2.start();
	// for this m1 of t1 start and end first then m2 of t2 start and end
		// bcause s1 is locked by t1 as soon as t1 release s1 then and then onlt s1.m1() of t2 exicuted
		
	*/
	//senario 3-->s1.m1() and s2.m1();
/*	Thread t1=new Thread(){
			public void run()
			{
			s1.m1();	
				
			}
		
		};
	
	
	Thread t2=new Thread(){
		public void run()
		{
			s2.m1();
		}
		
	};
	
	t1.setName("T1");
		t2.setName("T2");
		
		t1.start();
		//try{Thread.sleep(20*100);}catch(InterruptedException e){}
		t2.start();*/
	
	/* output-->
	
	T1 m1 started()
T2 m1 started()
T1m1 ended()
T2m1 ended()

s1 locked by t1 and s2 locked by t2 both are free to access m1 sequence is all depend on scheduler
	
	*/
	
	//senario4--> 
	Thread t1=new Thread()
	{
		public void run()
		{
			Sync.m5();//m5 is static so class called
			
		}
	};
	
	Thread t2=new Thread()
	{
	public void run()
	{
		Sync.m4();//m4 isstatic so we called it tthrugh class name
	}
	};
	
	t1.setName("t1");
	t2.setName("t2");
	
	t1.start();
	//try{Thread.sleep(4*1000);}catch(InterruptedException e){}
    t2.start();	
// in this senario s2 locked by t2 and s1 by  t1 	
	
	System.out.println("sync m5 to t1 and sync m4 to t2");
	
 }	
}
	
		
		
		
		
		
	
	
	
	
	
	
	
	