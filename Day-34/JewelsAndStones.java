import java.util.HashSet;
import java.util.Set;

class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char j : jewels.toCharArray()) {
            jewelSet.add(j);
        }

        int count = 0;
        for (char s : stones.toCharArray()) {
            if (jewelSet.contains(s)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Expected 3, got: " + numJewelsInStones("aA", "aAAbbbb"));
        System.out.println("Expected 0, got: " + numJewelsInStones("z", "ZZ"));
    }
}