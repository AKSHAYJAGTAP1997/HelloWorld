import java.util.*;


class Test2{
	
	/*static void preOrder(int[] a, int n){
		
		int temp;
		for(int i=0;i<n-1;i++){
			
			
				
				if(a[i]>a[i+1]){
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			
			
			
		}
		
		
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
	}
	
	public static void main(String[] args){
		
		int arr[]={3,7,4,15,22};
		int n=arr.length;
		preOrder(arr,n); */
		
	/*	public  static void preOrder(int[] arr,int n){
			
			Arrays.sort(arr);
			for(int i=0;i<n;i++){
			int count=1;
			
			while(i<n-1 && arr[i] == arr[i + 1]){
				
				i++;
				count++;
			}
			
			
		System.out.println(arr[i] + ": " + count);
		
		}
			
			
		}
		
		
		public static void main(String[] args){
			
			int arr[]={2,10,9,8,5,4,3,1,5,3,1,9};
			int n =arr.length;
			preOrder(arr,n);
		}
		
		
	} */
	
	public static void main(String[] args ){
		
		String str="ram",nstr="";
		
		char c;
		
		for(int i=str.length()-1;i>=0;i--){
			
			c=str.charAt(i);
			nstr=nstr+c;
			
			
			
		}
		
		System.out.print("reverse of "+str+" is "+nstr  );
		
	}
	


}



