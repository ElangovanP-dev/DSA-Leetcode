public class FirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();

        if (nl == 0) {
            return 0;
        }

        for (int i = 0, j = nl; j <= hl; i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Example 1 Input: haystack = \"" + haystack1 + "\", needle = \"" + needle1 + "\"");
        System.out.println("Example 1 Output: " + strStr(haystack1, needle1));

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Example 2 Input: haystack = \"" + haystack2 + "\", needle = \"" + needle2 + "\"");
        System.out.println("Example 2 Output: " + strStr(haystack2, needle2));
    }
}
