/*import java.util.*;
class as

{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i;
		int j;
		
		Scanner sc=new Scanner(System.in);
		//System.out.print("arguments are =");
		
		for( i=0;i<a.length;i++)
		{
			for( j=0;j<a.length;j++)
			{
				System.out.print(" argument are =");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		//matrix 2 input
		
		for( i=0;i<b.length;i++)
		{
			for( j=0;j<b.length;j++)
			{
				System.out.print(" arguments ar =");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
			
			//matrix 3
			for( i=0;i<b.length;i++)
			{
				for( j=0;j<b.length;j++)
				{
					System.out.print("argument are =");
					c[i][j]=a[i][j]+b[i][j];
				}
				System.out.println();
			}
				
				for(int x[]:a)
				{
					for(int y:x)
					{
						System.out.print(y+"  ");
					}
					System.out.println();
				}
				for(int x[]:b)
				{
					for(int y:x)
					{
						System.out.print(y+"  ");
					}
					System.out.println();
				}
				for(int x[]:c)
				{
					for(int y:x)
					{
						System.out.print(y+"  ");
					}
					System.out.println();
				}
	}
}

		

				
					
				
				
		
	*/





import java.util.*;
class Array10
{


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a1[][]=new int[3][3];
		int b1[][]=new int[3][3];
		int c1[][]=new int[3][3];
		
	
		//Matrix Input 1
		for(int i=0;i<a1.length;i++){//Row
			for(int j=0;j<a1.length;j++){//Col
		
				System.out.print("Array elements:");
				a1[i][j]=sc.nextInt();//input 
				}
				//System.out.println();
		}
		//MAtrix Input 2
		for(int i=0;i<b1.length;i++){//Row
			for(int j=0;j<b1.length;j++){//Col
		
				System.out.print("Array elements:");
				b1[i][j]=sc.nextInt();//input 
				}
				//System.out.println();
		}
		//--------------------------------------------------
		//MAtrix Input 2
		for(int i=0;i<c1.length;i++){//Row
			for(int j=0;j<c1.length;j++){//Col
		
				c[i][j]= a[i][j]+b[i][j];
				}
				//System.out.println();
		}
		//-------------------------------------------------
		//Printing with for each Matrix 1
		for(int x[] : a1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//Printing with for each Matrix 2
		for(int x[] : b1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		//-------------------------------------------------
		
		//Resultant Matrix
		//Printing with for each Matrix 2
		for(int x[] : c1){
			for(int y : x){
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
	}
}
















	