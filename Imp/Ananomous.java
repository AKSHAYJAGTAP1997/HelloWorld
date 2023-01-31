class Ananomous
{
	public static void main(String[] args)
	{
		Thread t1 =new Thread(){
			public void run(){
				int sum=0;
				for(int i=0; i<=10;i++){
					sum=sum+i;
				}
				System.out.println(sum);
				
			}
			
		};
		
		Thread t2 =new Thread(){
			public void run(){
				int mul=1;
				for(int i=1; i<=10;i++){
					mul=mul*i;
				}
				System.out.println(mul);
				
			}
			
		};
		t1.start();
		t2.start();
	}
}

