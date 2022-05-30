import java.util.Arrays;

public class LongestMatchSubString {

    public static void main(String[] args) {
        LongestMatchSubString str = new LongestMatchSubString();
        String inout = "abab";
        System.out.println(str.calculateN(inout));

    }

    private int calculateN(String S) {

        if (S.length() < 2) return 0;

        int len = 0;
        for (int i = 0; i < S.length(); i++) {
            String prefix = S.substring(0, i);
            String suffix = S.substring(S.length() - i, S.length());
            if (prefix.equalsIgnoreCase(suffix)) {
                len = prefix.length();
                if (len > 0) {
                    len = prefix.length();

                }
            }
        }
        return len;
    }

    private int calculate(String value) {
        int length = value.length();

        if (length < 2) return 0;

        int nLength = 0;

        int i = (length + 1) / 2;
        while (i < length) {
            if (value.charAt(i) == value.charAt(nLength)) {
                ++i;
                ++nLength;
            } else {
                i = i - nLength + 1;
                nLength = 0;
            }
        }

        return nLength;
    }
}
