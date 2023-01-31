import java.util.*;

public class Practise{
	
	
	public static void main(String[] args)
	{
		
		int[] a={1,2,3,6};
		int[] b={2,3,1,6,7};        
		
		if(EqualsOf(a,b)){
			System.out.print("arrays are equals");
		}
		
		else
		{
			System.out.print("arrays are not equals");
		}
		
	}
	
	
	
	public static boolean EqualsOf(int[] a, int[] b){
		
		int n=a.length;
		int m=b.length;
		
		if(a.length!=b.length){
			return false;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0;i<n;i++){
			if(a[i]!=b[i]){
				return false;
			}
		}
		
		
		return true;
		
	}
}