package StringProblems;

public class ReverseOnlyLetters_917 {
    public static String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int len = chars.length;
        for (int i = 0, j = len - 1; i < j;) {
            char leftChar = chars[i];
            char rightChar = chars[j];
            if (isLetter(leftChar) && isLetter(rightChar)) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
            if (!isLetter(leftChar)) {
                i++;
            }
            if (!isLetter(rightChar)) {
                j--;
            }
        }
        return new String(chars);
    }

    private static boolean isLetter(char c) {
        if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
            return true;
        }
        return false;
    }
}
