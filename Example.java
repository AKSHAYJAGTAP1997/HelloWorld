public class Example {
   public static void main(String[] args) {
      // print statement at the start of the program
      System.out.println("Start...");
      System.out.print("Number of available processors are: ");
      System.out.println( Runtime.getRuntime().availableProcessors());
   }
}