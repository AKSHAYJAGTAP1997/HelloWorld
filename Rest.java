//GST 5%

import java.util.*;
import java.io.*;
class Rest
{
	public static void main(String[] akshay)
	{
		Scanner sc=new Scanner(System.in);
		char choice= '\0';
		System.out.println("GST IN: 03AWBPPP875K001 "+"             CONTACT:- +919548717272");
		System.out.println("WELCOME TO CAFE CAFETERIA");
		System.out.println("MENU CARD");
		System.out.println("1. Coffee   2. Pizza   3. Cake   4. SoftDrink   ");
		System.out.println("ENTER ITEM NUMBER WHICH YOU WANT");
		int a=sc.nextInt();
		try {
		switch (a) {
		case 1:
		        System.out.println("you ordered a cofee");
				System.out.println(" ");
				System.out.println("WHICH COFFEE YOU WANT??");
				System.out.println(" ");
				System.out.println("1. cold coffee....50  2. capachino .....150");
                System.out.println("3. regular coffee..100   4. chocolate coffee...125");
				System.out.println(" ");
                System.out.println(" ENTER  COFFEE NUMBER WHICH YOU WANT??");
                int b=sc.nextInt();
                switch (b) {
                 
                  case 1: System.out.println("you ordered cold coffee");
				  System.out.println(" ");
				  System.out.println("How many coffee cups you want??");
                          int cc=sc.nextInt();
                          int cc1=50;
                          int resultc=cc*cc1;
			      System.out.println("ANYTHING ELSE??");
				 
				 System.out.println("Total amount is="+resultc);
				 System.out.println(" ");
				 				  System.out.println("ENJOY YOUR COFFEE.....VISIT AGAIN!!!");
				 break;
				 
				 case 2: System.out.println("you ordered capachino");
				 System.out.println(" ");
				  System.out.println("How many  cups you want??");
				  System.out.println(" ");
                          int cn=sc.nextInt();
                          int cn1=150;
                          int resultcn=cn*cn1;
                 System.out.println("Total amount is="+resultcn);
				 System.out.println(" ");
				 				  System.out.println("ENJOY YOUR COFFEE.....VISIT AGAIN!!!");
				 break;
				 
				 case 3: System.out.println("you ordered regular coffee");
				 System.out.println(" ");
				  System.out.println("How many coffee cups you want??");
				  System.out.println(" ");
                          int rc=sc.nextInt();
                          int rc1=50;
                          int resultrc=rc*rc1;
                 System.out.println("Total amount is="+resultrc);
				 System.out.println(" ");
				 				  System.out.println("ENJOY YOUR COFFEE.....VISIT AGAIN!!!");
				 break;
				 
				 case 4: System.out.println("you ordered chocolate coffee");
				 System.out.println(" ");
				  System.out.println("How many coffee cups you want??");
				  System.out.println(" ");
                          int cf=sc.nextInt();
                          int cf1=50;
                          int resultcf=cf*cf1;
                 System.out.println("Total amount is="+resultcf);
				 System.out.println(" ");
				  System.out.println("ENJOY YOUR COFFEE.....VISIT AGAIN!!!");
				 break;
				 
				 default : System.out.println("YOU ENTERED WRONG OPTION");
				}
                	break;
				  
		case 2:
		        System.out.println("you ordered a pizza");
				System.out.println(" ");
				System.out.println("How many pizza  you want??");
				System.out.println(" ");
				  int d=sc.nextInt();
				  int e=350;
				  int result2=d*e;
				 // System.out.println("Your total bill is="+result2);
				  System.out.println("would you like to softdrink with it ??");
				  int cc=sc.nextInt();
				  switch (cc) {
					  case 1:
					  System.out.println("you ordered a softdrink");
				System.out.println("WHICH SOFTDRINK YOU LIKE TO DRINK ");
				System.out.println();
				System.out.println("1. COCA COLA....20/-  2. PEPSI.....22/-");
				System.out.println("3. MAZA.........30/-  4. ENERGY DRINK...120/-");
				System.out.println();
				System.out.println("enter number which softdrink you like");
				int c=sc.nextInt();
				switch (c) {
                 
                  case 1: System.out.println("you ordered coca cola");
				  System.out.println(" ");
				  System.out.println("How many coca cola you want you want??");
                          int cc2=sc.nextInt();
                          int cc3=20;
                          int resultc1=cc2*cc3;
                 System.out.println("Total amount is="+(resultc1+result2));
				 System.out.println(" ");
				 				 
				 break;
                  case 2: System.out.println("you ordered pepsi");
				  System.out.println(" ");
				  System.out.println("How many pepsi you want??");
                          int pp=sc.nextInt();
                          int pp1=22;
                          int resulpp=pp*pp1;
                 System.out.println("Total amount is="+(resulpp+result2));
				 System.out.println(" ");
				 				
				 break;
				 case 3: System.out.println("you ordered MAZA");
				  System.out.println(" ");
				  System.out.println("How many MAZA cane you want??");
                          int mm=sc.nextInt();
                          int mm1=30;
                          int resultmm=mm*mm1;
                 System.out.println("Total amount is="+(resultmm+result2));
				 System.out.println(" ");
				 				  
				 break;
				 case 4: System.out.println("you ordered ENERGY DRINK");
				  System.out.println(" ");
				  System.out.println("How many ENERGY DRINK cane you want??");
                          int ee=sc.nextInt();
                          int ee1=120;
                          int resultee=ee*ee1;
                 System.out.println("Total amount is="+(resultee+result2));
				 System.out.println(" ");
				break;}
				case 2 :  System.out.println("total amount is="+result2);
				  				  System.out.println("ENJOY YOUR FOOD.....VISIT AGAIN!!!");
								  break;
								  default: System.out.println();
				  }
				  
				
				
				//System.out.println(" ");
				 
				  break;
				  
		 case 3:
		        System.out.println("you ordered a cake");
				System.out.println(" ");
				System.out.println("How many cake you want??");
				System.out.println(" ");
				  int f=sc.nextInt();
				  int g=200;
				  int result3=(f*g);
				  System.out.println("Your total bill is="+result3);
				  System.out.println(" ");
				  				 System.out.println("ENJOY YOUR FOOD.....VISIT AGAIN!!!");
				  break;
		case 4:
		        System.out.println("you ordered a softdrink");
				System.out.println("WHICH SOFTDRINK YOU LIKE TO DRINK ");
				System.out.println();
				System.out.println("1. COCA COLA....20/-  2. PEPSI.....22/-");
				System.out.println("3. MAZA.........30/-  4. ENERGY DRINK...120/-");
				System.out.println();
				System.out.println("enter number which softdrink you like");
				int c=sc.nextInt();
				switch (c) {
                 
                  case 1: System.out.println("you ordered coca cola");
				  System.out.println(" ");
				  System.out.println("How many coca cola you want you want??");
                          int cc2=sc.nextInt();
                          int cc3=20;
                          int resultc1=cc2*cc3;
                 System.out.println("Total amount is="+resultc1);
				 System.out.println(" ");
				 				  System.out.println("ENJOY YOUR COCA COLA.....VISIT AGAIN!!!");
				 break;
                  case 2: System.out.println("you ordered pepsi");
				  System.out.println(" ");
				  System.out.println("How many pepsi you want??");
                          int pp=sc.nextInt();
                          int pp1=22;
                          int resulpp=pp*pp1;
                 System.out.println("Total amount is="+resulpp);
				 System.out.println(" ");
				 				  System.out.println("ENJOY YOUR PEPSI.....VISIT AGAIN!!!");
				 break;
				 case 3: System.out.println("you ordered MAZA");
				  System.out.println(" ");
				  System.out.println("How many MAZA cane you want??");
                          int mm=sc.nextInt();
                          int mm1=30;
                          int resultmm=mm*mm1;
                 System.out.println("Total amount is="+resultmm);
				 System.out.println(" ");
				 				  System.out.println("ENJOY YOUR MAZA.....VISIT AGAIN!!!");
				 break;
				 case 4: System.out.println("you ordered ENERGY DRINK");
				  System.out.println(" ");
				  System.out.println("How many ENERGY DRINK cane you want??");
                          int ee=sc.nextInt();
                          int ee1=120;
                          int resultee=ee*ee1;
                 System.out.println("Total amount is="+resultee);
				 System.out.println(" ");
				 				  System.out.println("ENJOY YOUR ENERGY DRINK.....VISIT AGAIN!!!");
				break;}
				break;
		default:  System.out.println("you choose wrong option");
		}
		catch (Exception e){
			
		
		
	}
}
}

	
		
		                    
		