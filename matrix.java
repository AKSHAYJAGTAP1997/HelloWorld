import java.util.*;

class matrix
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3], b[][]=new int [3][3], c[][]=new int[3][3], i,j,k;
		{
			Scanner as=new Scanner(System.in);
			System.out.println("ENTER FIRST MATRIX");
			for(i=0;i<3;i++)
			{
				for (j=0;j<3;j++)
				{
					System.out.print(" enter the num ["+i+"]["+j+"] =");
					a[i][j]=as.nextInt();
				}
			}
					
			System.out.println("ENTER POCKET MATRIX");
			for(i=0;i<3;i++)
			{
				for (j=0;j<3;j++)
				{
					System.out.print(" enter the num ["+i+"]["+j+"] =");
					b[i][j]=as.nextInt();
				}
			}
		
		System.out.println("First matrix....");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("SECOND matrix....");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
			{
				for (j=0;j<3;j++)
				{
					for(k=0;k<3;k++)
					{
						c[i][j]=c[i][j]*(a[j][k]+b[j][k]);
					}
				}
				
			}
		}
		System.out.println("matrix multiplication");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

		
	

	
	
	
	


			
