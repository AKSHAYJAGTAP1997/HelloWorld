class RethrowingAnExceptionDemo{

	public static void main(String[] args){
	
		try{
			int i = 1/0;
		}catch(Exception e){
			System.out.println("1");
			try{
				//throw new NullPointerException();
				throw e;
			}catch(ArithmeticException e1){
				System.out.println("4");
				try{
					throw e1;
				}catch(ArithmeticException e2){
					System.out.println("5");
				}
			}
		}finally{
			System.out.println("2");
		}
		System.out.println("3");
	
	}
}