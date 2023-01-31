class Problem4{

	void arrangement(int arr[]){
		int i = 0;
		int j = arr.length-1;
		while(i<j){
			if(arr[i]>0){
			int temp = arr[j];
			arr[j] =arr[i];
			arr[i] = temp ;
			j--;
			
			}
			i++;
		}	
			for(int a:arr){
			System.out.print(" "+a);
		}
			System.out.println();
 
	}
	
	public static void main(String args[]){
		
		int arr[] = {-4,4,-3,3,-2,2,-1,1};
		Problem4 p = new Problem4();
		for(int a:arr){
			System.out.print(" "+a);
		}
			System.out.println();
		p.arrangement(arr);
		
	
	
	}


}