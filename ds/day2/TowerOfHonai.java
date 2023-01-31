import java.util.*;

class TowerOfHonai
{
	static void toh(int n, char a,char b, char c)
	{
		
		if(n==1)
			System.out.println("Disk from "+a+" to "+c);
		else
		{
			toh(n-1,a,c,b);
			System.out.println("Disk from "+a+" to "+c);
			toh(n-1,b,a,c);
			//System.out.println("Disk from "+a+" to "+c);
			
			
		}
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("ENTER NUMBER OF DISK");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		toh(n,'A','B','C');
	}
	
}