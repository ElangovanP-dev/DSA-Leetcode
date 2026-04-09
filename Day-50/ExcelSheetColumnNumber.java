public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            res = res * 26;
            res += (columnTitle.charAt(i) - 'A' + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }
}