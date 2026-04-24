public class FurthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int originPoint = 0;
        int dashCount = 0;
        char[] arr = moves.toCharArray();
        for (char c : arr) {
            if (c == 'L') {
                originPoint--;
            } else if (c == 'R') {
                originPoint++;
            } else {
                dashCount++;
            }
        }
        if (originPoint < 0) {
            originPoint -= dashCount;
        } else {
            originPoint += dashCount;
        }
        return Math.abs(originPoint);
    }
}