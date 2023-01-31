
class MathOperations{
	
	int num1;
	int num2;
	
	MathOperations(int a, int b){
		num1 = a;
		num2 = b;
	}
	
	static int result;
	
	void add(){
		result = num1 + num2;
		System.out.println("Add Result : "+result);
	}
	
	void sub(){
		result = num1 - num2;
		System.out.println("Sub Result : "+result);
	}
	
}

class ConstructorDemo{

	public static void main(String[] args){
		
		MathOperations mo1 = new MathOperations  (10,20);
		mo1.add();
		
		MathOperations mo2 = new MathOperations  (40,30);
		mo2.sub();
		
		
		
	}
}