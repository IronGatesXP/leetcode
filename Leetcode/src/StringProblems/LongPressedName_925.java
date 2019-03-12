package StringProblems;

public class LongPressedName_925 {
    public static boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) {
            return true;
        }
        int lenName = name.length();
        int lenTyped = typed.length();
        if (lenName > lenTyped) {
            return false;
        }
        char[] charsName = name.toCharArray();
        char[] charsTyped = typed.toCharArray();
        int i = 0;
        int j = 0;
        for (; i < lenName && j < lenTyped;) {
            if (charsName[i] == charsTyped[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == lenName;
    }
}
