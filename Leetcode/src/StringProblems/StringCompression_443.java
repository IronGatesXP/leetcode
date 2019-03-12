package StringProblems;

public class StringCompression_443 {
    public static int compress(char[] chars) {
        if (chars.length < 2) {
            return chars.length;
        }
        int len = 1;
        int res = 1;
        for (int i = 0;i < chars.length - 1;i++) {
            if (chars[i] == chars[i + 1]) {
                len++;
            } else {
                res++;
                if (len > 1) {
                    res += Integer.toString(len).length();
                }
                len = 1;
            }
        }
        if (len > 1) {
            res += Integer.toString(len).length();
        }
        return res;
    }
}
