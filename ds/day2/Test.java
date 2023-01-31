import java.lang.*;
import java.util.Arrays;

class Test{
	
	public static void main(String[] args)
	{
		int[] s={10,20,30,40,50,60};
		
		int n=s.length;
		
		//freq(s,n);
		
		for(int i=n-1;i>=0;i--){
			System.out.print(s[i]+" ");
		}
		
		
		
		
		
	}
	
	
	static void freq(int[] arr,int n){
		
		
		  Arrays.sort(arr);
		for(int i=0;i<n;i++){
			
			int count=1;
			
			while(i<n-1 && arr[i]==arr[i+1]){
				i++;
				count++;
			}
			
			
			System.out.println(arr[i]+":"+count);
			
		}
		
		
		
	}
	
	
}