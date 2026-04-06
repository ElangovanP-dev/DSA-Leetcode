public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        return second;
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println("Example 1 Input: n = " + n1);
        System.out.println("Example 1 Output: " + climbStairs(n1));

        int n2 = 3;
        System.out.println("Example 2 Input: n = " + n2);
        System.out.println("Example 2 Output: " + climbStairs(n2));
    }
}
