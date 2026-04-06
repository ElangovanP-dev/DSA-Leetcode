public class DivideIntegers {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        double x = dividend;
        double y = divisor;
        
        if (x == y) return 1;
        if (y == 1) return (int) x;
        if (y == -1) return (int) (-x);

        int r = (int) (x / y);
        return r;
    }

    public static void main(String[] args) {
        int d1 = 10, s1 = 3;
        System.out.println("Input: 10/3 -> Output: " + divide(d1, s1));

        int d2 = 7, s2 = -3;
        System.out.println("Input: 7/-3 -> Output: " + divide(d2, s2));
    }
}
