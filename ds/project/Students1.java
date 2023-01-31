import java.util.Scanner;
class Students1
{
    public static void main(String[] args)
    {
	 
        String n[] = new String[5];
        int p[] = new int[];
 
         Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter name " + (i + 1) + ": ");
            n[i] = in.nextLine();
            System.out.print("Enter percentage: ");
            p[i] = in.nextInt();
            in.nextLine();
        }
 
        //selection sort
        int l=p.length;
        for (int i=0; i<l-1; i++) 
        {
            int pos = i;
            for (int j=i+1; j<l; j++) 
            {
                if (p[j] > p[pos]) 
                {
                    pos = j;
                }
            }
            // Swap percentage
            int t1 = p[pos];
            p[pos] = p[i];
            p[i] = t1;
            // Swap name
            String t2 = n[pos];
            n[pos] = n[i];
            n[i] = t2;
        }
 
        // Print top 10 Students
        System.out.println("RANK \t NAME \t PERCENTAGE");
        for (int i = 0; i < 5; i++)
        {
            System.out.println((i+1) + " \t " + n[i] + " \t " + p[i]);
        }
    }
}