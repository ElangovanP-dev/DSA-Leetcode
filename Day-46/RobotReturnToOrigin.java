public class RobotReturnToOrigin {
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == 'R') x++;
            else if (c == 'L') x--;
        }

        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        String moves1 = "UD";
        System.out.println("Example 1: moves = \"" + moves1 + "\" -> " + judgeCircle(moves1));

        String moves2 = "LL";
        System.out.println("Example 2: moves = \"" + moves2 + "\" -> " + judgeCircle(moves2));
    }
}
