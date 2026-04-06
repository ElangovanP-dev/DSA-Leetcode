public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int r = 0;
        int temp = x;
        while (x != 0) {
            r = r * 10 + x % 10;
            x = x / 10;
        }
        
        return temp == r;
    }

    public static void main(String[] args) {
        int x1 = 121;
        System.out.println("Input: x = " + x1);
        System.out.println("Output: " + isPalindrome(x1));

        int x2 = -121;
        System.out.println("Input: x = " + x2);
        System.out.println("Output: " + isPalindrome(x2));

        int x3 = 10;
        System.out.println("Input: x = " + x3);
        System.out.println("Output: " + isPalindrome(x3));
    }
}
