
package Parent;
import java.util.*;
import java.io.*;
public class Restaurants
{
	 Scanner sc = new Scanner(System.in);
	String s[] = new String[] {"EXPRESSO         " , "DOUBLE EXPRESSO","CAPPACINO        ","LATTE            ","MOCHA            ","WHITE TEA        ","GREEN TEA        ","BLACK TEA        ","LEMON TEA        ","HAND MADE COOKIES","CHOCOLATE CUPCAKE","CREAM ROLL       ","Quit"};
	int rate[] = new int[]{100,150,125,125,130,30,25,20,20,10,12,10};
	int qt[] = new int[11];
        double sum=0;
		double SGST=0;
	    double stax=5;
		double CGST=0;
		double ctax=5;
		double gross=0;
		
	    int flag=0;
		int count=5;
		  
	
	boolean b=true;
	int aj;
	int q;
	
	public void m1(){
		do{
            System.out.println("ITEM"+"\t\t\t\t\tPrice");
		for(int i=0;i<11;i++)
            System.out.println((i+1)+"."+s[i]+"\t\t\t"+rate[i]);
		
			System.out.println("Enter your choice");
	
		try{
			 aj=sc.nextInt();
			
		}catch(InputMismatchException e){
			flag=1;
			System.out.println("Plese Enter Valid Choice...");
		}
	     if(aj>0 && aj<=11)
	    {
			//try{
		System.out.println("enter the no of quantites of "+s[aj-1]);
		       
                 q=sc.nextInt();
				 flag=0;
			 //}catch(InputMismatchException e){
				//   System.out.println("Plase Enter Valid Choice...");
				   
			 //}
				  // flag=1;
			    //b=true;
				  
			   
			   
			   
	         qt[aj-1]+=q;
			 System.out.println("ANYTHING ELSE??? IF NO THEN PRESS 0");
			 System.out.println(" ");
		
	    }
	    else
	    {
               b=false;
              
		}		
        }while(b);
	
	   if(flag==0)
	   {
        System.out.println("Your Orders are:");
		System.out.println(" ");
		
	    for(int i=0;i<11;i++)
	    {
             if(qt[i]!=0)
	     {
	      sum+=qt[i]*rate[i];
              System.out.println(s[i]+"  x   "+qt[i]+"="+qt[i]*rate[i]+"rs");
			
              SGST =( sum*stax)/100;
			  CGST=( sum*ctax)/100;
			  gross= SGST+CGST+sum;
           
//System.out.println("sgst"+"="+sgst);
		   
			
		   
	     }
	    }
	   
       
        System.out.println("Your  bill="+sum+"\n");
		System.out.println("stax="+stax+"%\n");
		System.out.println("ctax="+ctax+"%\n");
		System.out.println("SGST"+"="+SGST+"\n");
		System.out.println("CGST"+"="+CGST+"\n");
		System.out.println("your gross bill="+gross+"\n");
        
         System.out.println("ENJOY YOUR COFFEE ....VISIT AGAIN!!!");
    
    
    }
    }
		
		
		
		
	}
	


