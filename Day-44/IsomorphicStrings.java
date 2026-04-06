public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[200];
        int[] indexT = new int[200];
        int len = s.length();

        if (len != t.length()) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg", t1 = "add";
        System.out.println("Example 1: s = \"" + s1 + "\", t = \"" + t1 + "\" -> " + isIsomorphic(s1, t1));

        String s2 = "foo", t2 = "bar";
        System.out.println("Example 2: s = \"" + s2 + "\", t = \"" + t2 + "\" -> " + isIsomorphic(s2, t2));
    }
}
