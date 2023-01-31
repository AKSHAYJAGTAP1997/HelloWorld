  class Dog1// parent class
{int x=200;
     void m1()
    {
        System.out.println("woof!");
    }

  
}

class Beagle extends Dog1//child class
{     
    {
		System.out.println("DOG IS BARKING");
	}
	 Beagle ()// run 
	{
		System.out.println("LOCAL DOG");
	}
	
	/*public Beagle(int a)///CTE:-constructor Beagle in class Beagle cannot be applied to given types
	{
       System.out.println("LOCAL DOG1");
	}*/
	
     void m1()
    {
        System.out.println("arf arf");
    }
}


class Dog
{
	 public static void main(String[] args)
    {
       // Dog1 d = new Dog1();//creating object of class itself
        //d.m1();
        Beagle d1 = new Beagle();//  create object of beagle reffering Dog class
        d1.m1();//call to instance method from beagle class
		//d1.m2();
		System.out.println(d1.x);
	}
}



