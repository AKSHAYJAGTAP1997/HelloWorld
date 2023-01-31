class Java3

{
   public static void main(String[] args)
   {
      int a[][] = new int[10][30];
      int b = 1, c = 1;
      for(int i= 0; i < a.length; i++)
      {
         for(int j = 0; j < a[i].length; j++)
         {
            a[i][j] = b * c;
            c = c + 1;
         }
         b = b+ 1;
         c = 1;
		  }
      for(int i = 0; i < a.length; i++)
      {
         for(int j = 0; j< a[i].length; j++)
         {
            System.out.print(" " + a[i][j] + "\t| ");
         }
         System.out.print("\n");
      }
   }
}
