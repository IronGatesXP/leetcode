package StringProblems.Easy;

/**
 * @author XP
 * @date 2018/11/11 21:36
 */
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        String firstChar = word.substring(0, 1);
        String secondPart = word.substring(1, word.length());
        if (isCapitals(firstChar)) {
            return isCapitals(secondPart) || isNotCapitals(secondPart);
        } else {
            return isNotCapitals(word);
        }
    }

    public static boolean isCapitals(String s) {
        boolean flag = true;
        for (int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);
            if (ch < 65 || ch > 90) {
                return false;
            }
        }
        return flag;
    }

    public static boolean isNotCapitals(String s) {
        boolean flag = true;
        for (int i = 0;i < s.length();i++) {
            char ch = s.charAt(i);
            if (ch < 97 || ch > 122) {
                return false;
            }
        }
        return flag;
    }
}
