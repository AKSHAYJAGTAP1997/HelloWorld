import java.io.*;
class CheckedExceptionDemo1{

	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("1");
		File f = new File("abcd.txt");
		FileReader fr = new FileReader(f);//throw new FileNotFoundException();
		System.out.println("2");
	}
}


//try - catch 
// throws (is written at method level)
// FileNotFoundException
