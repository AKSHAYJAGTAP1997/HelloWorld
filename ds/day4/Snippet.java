

/*
class Snippet {
	static int fun(int n)
	{
		if (n >100)
			return n - 10;
		return fun(fun(n+10));
	}
	
	public static void main (String[] args) {
		System.out.println(" " + fun(99) + " ");
	}
}


*/




class Snippet {

	static void akshay(int x  )  
	{
		if(x >0)
		{
			akshay(--x);
			System.out.print(x + " ");//0,1,2,0,3,0,1
			akshay(--x);
		}
		//System.out.print(x + " "); 
		
	}
	
	public static void main (String[] args)
	{
		int a = 4;
		akshay(a);
	}

}


