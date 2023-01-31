class QuickSort
{
	
	int partition(int arr[], int low, int high)
{
	int pivot=arr[(low+high)/2];//3 methods to decide pivot..1 is take right or left end value but due to tis time complexicity increased
	                            //2. takke any random value and third we used
	while(low<=high)
	{
		while(arr[low]<pivot)
		{
			low++;
		}
		while(arr[high]>pivot)
		{
			high--;
		}
		if(low<=high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		
//return low;// takes return because we take condition in recursion method
	}
	return low;
}

void recursion(int arr[], int low,int high)
{
	int x=partition(arr,low,high);
	if(low<(x-1))
	{
		recursion(arr,low,x-1);
	}
	if(x<high)
	{
		recursion(arr,x,high);
	}
}


void display(int arr[])
{
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
}
	
	
	
public static void main(String[] args)
{
int arr[]={11,2,99,44,12,33,3,55};

int length=arr.length;
QuickSort a=new QuickSort();
a.recursion(arr,0,length-1);
a.display(arr);
}	


}