package StringProblems.Easy;

public class LongestUncommonSubsequence1_521 {
    // 3ms
    public int findLUSlength(String a, String b) {
        // 只需要判断两个字符的长度是否相等，如果相等就返回-1，否则返回较长的字符串
        int aLen = a.length();
        int bLen = b.length();
        if (a.equals(b)) {
            return -1;
        }
        return aLen > bLen ? aLen : bLen;
    }

    // 2ms
    public int findLUSlengthOpti(String a, String b) {
        // 只需要判断两个字符的长度是否相等，如果相等就返回-1，否则返回较长的字符串
        return a.equals(b)? -1: Math.max(a.length(), b.length());
    }
}
