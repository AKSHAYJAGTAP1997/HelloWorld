import java.util.*;

class Array
{
public static void main(String args[])
{
	int[]a1={11,22,33,44,55,66,77,88,99,110,121};
	//a1=new int[11];
	System.out.println(" original elements"+Arrays.toString(a1));
	int i;
	
	/*----------------
	a1[0]= 55;
	a1[1]= 33;
	a1[2]= 22;
	a1[3]= 11;
	a1[4]= 66;
	a1[5]= 88;
	a1[6]= 0;
	a1[7]= 44;
	a1[8]= 99;
	a1[9]= 22;
	
	*/
	
	
	int n=10;

	//---------------
	for( i=0;i<n;i++)
	{
		System.out.print(a1[i]+" ");
	}


int val=10;
int index=2;
int j=0;
int k=0;

int array[]=new int [a1.length+1];
for (k=0;k<array.length;k++)
{
	if(k==index)
	{
		array[k]=val;
	}
	else
	{
		array[k]=a1[j];
		j++;
	}
}

System.out.println(Arrays.toString(array));

	//-------------------
	/*int key=60;
	for(j=0;j<n;j++)
	{
		if(a1[j] == key)
			break;
	}
	if(a1[j]==n)
		System.out.println("Not found");
	else
		System.out.println("Found");
	
	//-------------------------
	key =66;
	for(j=0;j<n;j++)
	{
		if(a1[j] == key)
			break;
	}
	for(int k=j;k<n;k++)
		a1[k]=a1[k+1];
	n--;
	
	//---------------
	for(int i=0;i<n;i++)
	{
		System.out.print(a1[i]+" ");
	}
	*/
	
	
	
	
}

}                