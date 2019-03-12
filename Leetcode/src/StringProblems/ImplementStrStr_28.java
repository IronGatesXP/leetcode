package StringProblems;

public class ImplementStrStr_28 {
    public static int strStr(String haystack, String needle) {
        if (needle.trim().equals("")) {
            return 0;
        }
        int lenH = haystack.length();
        int lenN = needle.length();
        for (int i = 0; i <= lenH  - lenN;i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }
            int temp = i + 1;
            for (int j = 1;j < lenN;) {
                if (haystack.charAt(temp) != needle.charAt(j)) {
                    continue;
                }
                temp++;
                j++;
            }
            return i;
        }
        return -1;
    }
}
