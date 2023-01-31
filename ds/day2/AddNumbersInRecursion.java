public class AddNumbersInRecursion {

    public static void main(String[] args) {
        int x = 10;
        int sum = addNumbers(x);
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
}