class MergeSort
{
	int a[];
	int temp[];
	int length;
	public static void main(String[] args)
	{
		int  inputarr[]={23,89,45,67,43,12,9,90};
        		
				MergeSort m=new MergeSort();
				m.sort(inputarr);
				
				for(int i:inputarr)
				{
					System.out.print(i+" ");
				}
	}
	
	public void sort(int inputarr[])
	{
		this.a=inputarr;
		this.length=inputarr.length;
		this.temp=new int[length];//making temparary array;
		divide(0,length-1);
		
	}
	
	public void divide(int lowerindex, int higherindex)
	{
		if(lowerindex<higherindex)
		{
			int middle=lowerindex+(higherindex-lowerindex)/2;
			divide(lowerindex,middle);//left hans side array ko sort krne ke liye
			divide(middle+1,higherindex);//right hand side arry ko sort krne keliye
			merge(lowerindex,middle,higherindex);
			
		}
		
	}
	
	public void merge(int lowerindex, int middle, int higherindex)
	{
		for(int i=lowerindex;i<=higherindex;i++)
		{			temp[i]=a[i];
			
		}
		
		int i=lowerindex;
		int j=middle+1;
		int k=lowerindex;
		while(i<=middle && j<=higherindex)
		{
			if(temp[i]<=temp[j])
			{
				a[k]=temp[i];
				i++;
			}
			
			else
			{
				a[k]=temp[j];
				j++;
			}
			k++;
		}
		
		
		while(i<=middle)
		{
			a[k]=temp[i];
			k++;
			i++;
		}
	}
}