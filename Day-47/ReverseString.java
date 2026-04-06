import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;
        
        while (first < last) {
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Example 1 Input: " + Arrays.toString(s1));
        reverseString(s1);
        System.out.println("Example 1 Output: " + Arrays.toString(s1));

        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("\nExample 2 Input: " + Arrays.toString(s2));
        reverseString(s2);
        System.out.println("Example 2 Output: " + Arrays.toString(s2));
    }
}
