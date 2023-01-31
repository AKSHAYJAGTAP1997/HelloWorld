// Java program to find the missing Number
class MissingNumber{


static void  Missing(int a[], int n)
{
	int sum = n * (n + 1) / 2; // 21
	int sum1 = 0;

	for(int i = 0; i < n - 1; i++)
		sum1 += a[i];// 0+1=1 sum1 =1...15
	System.out.print("missing number is "+(sum-sum1));
}


public static void main(String[] args)
{
	int a[] = { 1, 2, 3, 5 ,6};// 1 to 6
	int n = a.length + 1;
	Missing(a, n);
	
	//System.out.print("missing number is "+x);
}
}


