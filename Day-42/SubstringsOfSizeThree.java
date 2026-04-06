public class SubstringsOfSizeThree {
    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            if (a != b && b != c && c != a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "xyzzaz";
        System.out.println("Example 1 Input: s = \"" + s1 + "\"");
        System.out.println("Example 1 Output: " + countGoodSubstrings(s1));

        String s2 = "aababcabc";
        System.out.println("Example 2 Input: s = \"" + s2 + "\"");
        System.out.println("Example 2 Output: " + countGoodSubstrings(s2));
    }
}
