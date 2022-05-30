import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("a10", "10a"));
    }

    public boolean solution(String S, String T) {
        // write your code in Java SE 8
        boolean flag = true;
        int SLength = 0;
        int TLength = 0;

        String[] sSubString = S.split("[^\\d]+");
        String[] tSubString = T.split("[^\\d]+");

        for (int i = 0; i < sSubString.length; i++) {
            if (!sSubString[i].equals("")) {
                SLength += Integer.parseInt(sSubString[i]);
            }
        }
        System.out.println("SLength  " + SLength);

        for (int i = 0; i < tSubString.length; i++) {
            if (!tSubString[i].equals("")) {
                TLength += Integer.parseInt(tSubString[i]);
            }
        }
        System.out.println("TLength  " + TLength);

        for (int i = 0; i < S.length(); i++) {
            if (!Character.isDigit(S.charAt(i))) {
                SLength += 1;
            }
        }
        System.out.println("SLength  " + SLength);

        for (int i = 0; i < T.length(); i++) {
            if (!Character.isDigit(T.charAt(i))) {
                TLength += 1;
            }
        }
        System.out.println("TLength  " + TLength);

        if (TLength != SLength) {
            flag = false;
        }

        return flag;
    }
}
