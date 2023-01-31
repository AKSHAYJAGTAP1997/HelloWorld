import java.util.Scanner;
class Dietplan
{
	int Age;
	float weight;
	double gen;
	float  height;

	Dietplan()
	{
		this(0,0,0,0);
		
	}
	Dietplan(int Age,float weight,double gen,float  height)
	{
	 this.Age =Age ;
 this.weight=weight;
 this.gen=gen;
	 this. height = height;
	}
	   void calculateBMI()
	   {
       /* System.out.print("Please enter your weight in kg: ");
        Scanner s = new Scanner(System.in);
        weight = s.nextFloat();
        System.out.print("Please enter your height in cm: ");
       height = s.nextFloat();*/
         
        // multiplication by 100*100 for cm to m conversion
        float bmi = (100*100*weight)/(height*height);
         
        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);
         
    }
	 static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }
     
void getdata()
	{
			System.out.println(Age);
		System.out.println(weight);
		System.out.println(gen);
		System.out.println( height);
	}
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
	System.out.println("age:");
 int Age = sc.nextInt();
 System.out.println("weight:");
 float weight=sc.nextFloat();
 System.out.println("gen ,1 for male,0 for female :");
 double gen =sc.nextDouble();
 System.out.println("height:");
 float height= sc.nextFloat();

	
		 Dietplan d1 = new  Dietplan(Age,weight,gen,height);
		 d1.calculateBMI();
		 
		
	}
}