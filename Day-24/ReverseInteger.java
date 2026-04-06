public class ReverseInteger {
    public static int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        int num = Math.abs(x);
        int rev = 0;
        
        while (num != 0) {
            int ld = num % 10;
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0;
            }
            rev = rev * 10 + ld;
            num = num / 10;
        }
        
        return rev * sign;
    }

    public static void main(String[] args) {
        int x1 = 123;
        System.out.println("Input: x = " + x1 + " -> Output: " + reverse(x1));

        int x2 = -123;
        System.out.println("Input: x = " + x2 + " -> Output: " + reverse(x2));

        int x3 = 120;
        System.out.println("Input: x = " + x3 + " -> Output: " + reverse(x3));
    }
}
