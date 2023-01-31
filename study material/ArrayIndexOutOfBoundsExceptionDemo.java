class ArrayIndexOutOfBoundsExceptionDemo{

	public static void main(String[] args){
		try{
			try{
				int arr[] = {1,2,3,4,5};
				arr[10] = 10;// throw new ArrayIndexOutOfBoundsException();
				
				String str = "abcd";
				//char c = str.charAt(6);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("1");
				throw e;
			}catch(StringIndexOutOfBoundsException e){
				System.out.println("2");
				//throw e;
			}catch(IndexOutOfBoundsException e){
				System.out.println("3");
			}catch(Exception e){
				System.out.println("4");
			}finally{
				System.out.println("5");
			}
			
			System.out.println("6");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("7");
		}finally{
			
		}
		
		System.out.println("10");
	}
}