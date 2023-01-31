import java.util.Scanner;
 class new1
 {
	 public static void main(String args[])
	 {
		 Scanner as=new Scanner (System.in);
		 System.out.println("ENTER THE NUM FOR SWAP");
		 System.out.println("VALUE OF a1 IS =");
		 double a1=as.nextDouble();
		 System.out.println("VALUE OF a2 IS=");
		 double a2=as.nextDouble();
		 a1=a1-a2;
		 a2=a1+a2;
		 a1=a2-a1;
		 System.out.println("VALUE OF a1="+a1);
		 System.out.println("VALUE OF a2="+a2);
	 }
 }
		 
		 