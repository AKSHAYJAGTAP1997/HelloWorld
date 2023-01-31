//Reference Data type / Objects

class Printer{
	
	static int i = 10;
	int a = 200;
	int b = 200;
	
	void print(){
		System.out.println("Printing");
	}
	
	static void printStatic(){
		
	}
}


class PrinterDemo{

	static int x;
	static{}
	
	//instance variables are part of Object
	int p;
	int q;
	static void m2(){
		
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
		
		Printer p = new Printer();
		System.out.println(p.a);
		System.out.println(p.b);
		
		
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