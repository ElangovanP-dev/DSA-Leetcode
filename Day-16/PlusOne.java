import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] d1 = {1, 2, 3};
        System.out.println("Example 1: " + Arrays.toString(plusOne(d1)));

        int[] d2 = {4, 3, 2, 1};
        System.out.println("Example 2: " + Arrays.toString(plusOne(d2)));

        int[] d3 = {9};
        System.out.println("Example 3: " + Arrays.toString(plusOne(d3)));
    }
}
