//Move all negative numbers to beginning and positive numbers at the end of the array.
class NegativePos
{
    static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {                
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;                
                j++;
            }			
        }
    }    
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    public static void main(String args[])
    {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length; 
        rearrange(arr, n);
        printArray(arr, n);
    }
}