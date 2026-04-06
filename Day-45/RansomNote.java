public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Example 1: ransomNote = \"a\", magazine = \"b\" -> " + canConstruct("a", "b"));

        System.out.println("Example 2: ransomNote = \"aa\", magazine = \"ab\" -> " + canConstruct("aa", "ab"));

        System.out.println("Example 3: ransomNote = \"aa\", magazine = \"aab\" -> " + canConstruct("aa", "aab"));
    }
}
