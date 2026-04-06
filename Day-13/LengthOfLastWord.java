public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        if (arr.length == 0) return 0;
        String ans = arr[arr.length - 1];
        return ans.length();
    }

    public static void main(String[] args) {
        System.out.println("Example 1: " + lengthOfLastWord("Hello World"));
        System.out.println("Example 2: " + lengthOfLastWord(" fly me to the moon "));
        System.out.println("Example 3: " + lengthOfLastWord("luffy is still joyboy"));
    }
}
