import java.util.*;

class BS
{
	public static int bsearch(int arr[], int x,int lower, int higher)  // set lower limit and upper limit
	
	{
	if(higher>=lower)	
	{
		int mid=lower+(higher-lower))/2;// (lower + higher)/2; also used but currently used equation is used for avoid exception
// if key == mid then it will return mid 
		if(arr[mid]==x)
		return mid;
	// if key is smallr than mid value then take value from left side of mid
	if(arr[mid]>x)
		return bsearch(arr,x,lower,mid-1);
	// if key is higher than mid value then take value from right side of mid
	
		return bsearch(arr,x,mid+1,higher);
	}
	
	return -1;
		
	}
		
public static void main(String[] args)
{
	Scanner c=new Scanner(System.in);
	System.out.println("enter inex od=f array");
	int m=c.nextInt();
	 System.out.println("enter element of array");
	int arr[]=new int[m];
for(int n=0;n<arr.length;n++)
     {
	      arr[n]=c.nextInt();
      }
	  System.out.println(" element of array are");
	  for(int x:arr)
	  {
		  System.out.println(x);
	  }
	   System.out.println("insert key ");
	  int y=c.nextInt();
	//  System.out.println("set lower bound and upperbound");
	  int lower=0;
	  int higher=arr.length-1;//if you not write -1 then it will show array outofboun exception
	  int result=bsearch(arr,y,lower ,higher);
	  
	  if(result== -1)
		  System.out.println("element not found");
	  else
		  System.out.println("element found"+y);
	  
}	
	
	
	
	
	
	
	
	
	
	
	
}
