public class AddDigits {
    public static int addDigits(int num) {
        if (num == 0) return 0;
        else if (num % 9 == 0) return 9;
        else return num % 9;
    }

    public static void main(String[] args) {
        int num1 = 38;
        System.out.println("Input: num = " + num1);
        System.out.println("Output: " + addDigits(num1));

        int num2 = 0;
        System.out.println("Input: num = " + num2);
        System.out.println("Output: " + addDigits(num2));
    }
}
