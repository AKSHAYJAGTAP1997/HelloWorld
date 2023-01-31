import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args)   {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		
			String name = sc.next();
			//if(sc.next()==sc.nextInt())
			//{
			//}	
			//name =Integer.parseInt(name);
			int age=sc.nextInt();
			//int name =Integer.parseInt(name);
		System.out.println("enter age");
		
					
		try {

			if(age >=18 && age < 60)
				throw new InvalidAgeException("Invalid Age");
			System.out.println("Name: "+name+" Age: "+age);
			
		} catch (InvalidAgeException e) {

			System.out.println(e);
		}

	}

}

class InvalidAgeException extends Exception {

	public InvalidAgeException(String age) {

		super(age);

	}

}