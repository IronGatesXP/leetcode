package StringProblems.Easy;

public class BuddyStrings_859 {
    public static boolean buddyStrings(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        if (lenA != lenB) {
            return false;
        }
        if (A.equals(B)) {
            int[] counts = new int[26];
            for (int k = 0; k < lenA; k++) {
                counts[A.charAt(k) - 'a']++;
            }
            for (int count : counts) {
                if (count > 1) {
                    return true;
                }
            }
        }
        int i = 0;
        int j = lenA - 1;
        for (; i < lenA; i++) {
            if (A.charAt(i) != B.charAt(i)) {
                break;
            }
        }
        if (i >= lenA - 1) {
            return false;
        }
        for (; j > i; j--) {
            if (A.charAt(j) != B.charAt(j)) {
                break;
            }
        }
        if (j == i) {
            return false;
        }
        if (A.charAt(i) == B.charAt(j) && A.charAt(j) == B.charAt(i)) {
            return true;
        }
        return false;
    }
}
