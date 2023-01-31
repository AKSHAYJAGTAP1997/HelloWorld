
class Java2
{
	public static void main(String[] Akshay)
	{
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]=new int[3][3];
		int i,j;
		System.out.println("ORIGINAL MATRIX");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				
				System.out.println(" "+a[i][j]);
			}
			System.out.println(" ");
		}

		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=a[j][i];
				System.out.println(" "+b[i][j]);
			}
			System.out.println(" ");
		}
	}
}

	