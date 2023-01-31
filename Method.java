class Method1
{    
double x=10;
double y=20;
static double result;
	
	
			
		}
		
		Method1(int a,float b)
		{  
		  this.x=a;
			this.y=b;
		   result=this.x-this.y;
		   System.out.println("SUB IS="+result);
		    
		}
		
		 Method1(float a, int b)
		{
			this.x=a;
			this.y=b;
			result=this.x*this.y;
			System.out.println("multiplication is="+result);
			
		}
		Method1(double a, double b )
		{
			this.x=a;
			this.y=b;
			result=this.x/this.y;
			System.out.println("DIVIDATION IS="+result);
		}
}
class Method
{
		public static void main(String[] akshay)
		{     System.out.println();
			Method1 m1=new Method1();
			System.out.println();
			Method1 m2=new Method1(50,25.01f);
			System.out.println();
			Method1 m3=new Method1(50.01f,25);
			System.out.println();
			Method1 m4=new Method1(50.50,25.25);
			System.out.println();
		}
	}



		   
			