package StringProblems.Easy;

public class CountBinarySubStrings_696 {
    public static int countBinarySubstrings(String s) {
        int [] count = new int[s.length()];
        int t = 0;
        count[t] = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count[++t] = 1;
            } else {
                count[t]++;
            }
        }
        int res = 0;
        for (int i =0; i < t; i++) {
            res += Math.min(count[i], count[i + 1]);
        }
        return res;
    }
}
