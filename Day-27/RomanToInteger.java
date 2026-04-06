import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = hm.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                result = result - hm.get(s.charAt(i));
            } else {
                result = result + hm.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();
        System.out.println("Input: s = \"III\"");
        System.out.println("Output: " + solution.romanToInt("III"));

        System.out.println("\nInput: s = \"LVIII\"");
        System.out.println("Output: " + solution.romanToInt("LVIII"));

        System.out.println("\nInput: s = \"MCMXCIV\"");
        System.out.println("Output: " + solution.romanToInt("MCMXCIV"));
    }
}
