class BinarySearch1
{
	
	public static int bsearch(int arr[],int key,int low,int high)
	{
		if(high>=low && low<=high)// lower limit pack in package not overflow array
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==key)
				return mid;
			
			if(arr[mid]>key)
				return bsearch(arr,key,low,mid-1);
			 return bsearch(arr,key,mid+1,high);
			
			
		} return -1;
		
		
	}
	
	public static void main(String[] args)
	{
		int arr[]={1,3,5,7,9};
		for(int x:arr)
		{
			System.out.println(x);
		}
		int key=4;
		System.out.println("key element is = "+key);
		int low=0;
		int high=arr.length-1;
		int result=bsearch(arr,key,low,high);
		
		
		if(result == -1)
			System.out.println("element not found");
		else
		System.out.println("element found");
	}
	
	
	
}