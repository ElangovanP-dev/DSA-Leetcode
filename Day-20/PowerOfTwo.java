public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n1 = 1;
        System.out.println("Example 1: " + isPowerOfTwo(n1));

        int n2 = 16;
        System.out.println("Example 2: " + isPowerOfTwo(n2));

        int n3 = 3;
        System.out.println("Example 3: " + isPowerOfTwo(n3));
    }
}
