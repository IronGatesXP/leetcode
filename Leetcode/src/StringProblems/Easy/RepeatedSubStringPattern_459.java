package StringProblems.Easy;

public class RepeatedSubStringPattern_459 {
    // Time Limit Exceeded
    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        // 考虑aa的情况。len / subStringLen > 1就排除了自己是自己的子串的情况
        int subStringLen = 1;
        while (subStringLen <= len / 2) {
            if (len % subStringLen == 0 && len / subStringLen > 1) {
                String subString = s.substring(0, subStringLen);
                int times = len / subStringLen;
                String res = "";
                while (times > 0) {
                    res += subString;
                    times--;
                }
                if (s.equals(res)) {
                    return true;
                }
            }
            subStringLen++;
        }
        return false;
    }

    public static boolean repeatedSubstringPatternOpti(String s) {
        int len = s.length();
        for (int i = 1;i <= len / 2;i++) {
            if (s.charAt(0) == s.charAt(i)) {
                if (len % i == 0) {
                    int times = len / i;
                    String subString = s.substring(0, i);
                    String res = "";
                    while (times > 0) {
                        res += subString;
                        times--;
                    }
                    if (s.equals(res)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean repeatedSubstringPatternOpti2(String s) {
        String str = s + s;
        // 相当于字符串右移，如果有子字符串能够满足条件，那右移后他一定在其中能找到原来的字符串
        // 取1到长度减1的原因：既排除了自身是自己子字符串的情况，又包含了其他可能的情况。如aa是最短的重复字符串
        return str.substring(1, str.length() - 1).contains(s);
    }
}
