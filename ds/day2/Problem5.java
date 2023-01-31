import java.util.Scanner;
class Problem5{
	public static void main(String ...god){
		Scanner java = new Scanner(System.in);
		System.out.println("ENTER THE NO. JAVA GOD");
			int a = java.nextInt() ;
			System.out.println(Akshay(a));
	}
	public static String Akshay( int shinde){
		if(shinde == 1){
			return "int";
		}
		return "gcd(int ,"+ Akshay(shinde-1)+")";
		
	
		
	}

}