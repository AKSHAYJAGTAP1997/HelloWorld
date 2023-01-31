class Combination
{
	static void display(String str,String res)
	{
		if(str.length() == 0)
		{
			System.out.println(res);
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.length(i);
			String r1=str.length(0,i)+str.length(i+1);
			display(r1,res+ch);
			
		}
			
		
	}


public static void main(String[] args)
{
String s1="AKS";
display(s1,"");
}

}