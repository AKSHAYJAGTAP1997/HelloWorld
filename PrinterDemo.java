//Reference Data type / Objects

class Printer{
	
	static int i = 10;
	int a = 200;
	int b = 200;
	
	void print(){
		System.out.println("Printing");
	}
	
	static void printStatic(){
	System.out.println("--------------------------------");
		
	}
}


class PrinterDemo{

	static int x;
	static{
		System.out.println("-x-x-x-x-x-x-x-xx-x--xx-x-x-x-x-x");
	}
	
	//instance variables are part of Object
	int p;
	int q;
	static void m2(){
		System.out.println("Demo:m2()");
	}
	void m1(){
		System.out.println("Demo:m1()");
	}
	
	public static void main(String[] args){
		PrinterDemo d = new PrinterDemo();
		System.out.println(d.p);
		System.out.println(d.q);
		
		d.p = 100;
		d.q = 200;
		
		d.m1();
		d.m2();
		System.out.println(d.p);
		System.out.println(d.q);
		Printer p = new Printer();
		System.out.println(p.a);
		System.out.println(p.b);
		
		p.printStatic();
		p.print();
		
		
		//
		System.out.println(x);
		System.out.println(PrinterDemo.x);
		m2();
		PrinterDemo.m2();
		
		
		System.out.println(Printer.i);
		Printer.printStatic();
	}
}