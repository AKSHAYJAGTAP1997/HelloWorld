import java.io.*;
class CheckedExceptionDemo2{
	static void m1() throws FileNotFoundException{
		System.out.println("1");
		File f = new File("abcd.txt");
		FileReader fr = new FileReader(f);//throw new FileNotFoundException();
		System.out.println("2");
	}
	static void m() throws FileNotFoundException{
		System.out.println("3");
		m1();
		System.out.println("4");
	}
	
	public static void main(String[] args){
		System.out.println("5");
		try{
			m();
		}catch(FileNotFoundException e){
			System.out.println("File is missing");
		}
		
		System.out.println("6");
	}
}
