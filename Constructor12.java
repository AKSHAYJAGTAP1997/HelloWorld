class Constructor1
{    
int x;
int y;
static int result;//0
	Constructor1(int a, int b)//50,25
	{
		 this.x=a;
		 this.y=b;
	}
	
		void add()
		{
			
			
			result=this.x+this.y;//50,25
			System.out.println("SUM IS="+result);
			 substraction();
		}
		
		void substraction()
		{  
		  
		   result=this.x-this.y;//50-25
		   System.out.println("SUB IS="+result);
		    multiplication();
		}
		
		void multiplication()
		{
			//int x=20;
			//int y=3;
			result=x*y;//20x3
			System.out.println("multiplication is="+result);
			division();
		}
		void division()
		{
			
			result=this.x/this.y;//50/25
			System.out.println("DIVIDATION IS="+result);
		}
}
class Constructor12
{
		public static void main(String[] akshay)
		{     System.out.println();
			Constructor1 c1=new Constructor1(50,25);
			
			c1.add();
			System.out.println();
			Constructor1 c2=new Constructor1(100,50);
			c2.add();
			
			System.out.println();
		}
	}



		   
			