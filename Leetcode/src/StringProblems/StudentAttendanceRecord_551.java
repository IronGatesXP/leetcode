package StringProblems;

import java.util.Arrays;

public class StudentAttendanceRecord_551 {
    public static  boolean checkRecord(String s) {
        int lenA = s.lastIndexOf("A") - s.indexOf("A");
        if (lenA > 0) {
            return false;
        }
        for (int i = 0;i < s.length();i++) {
            if (s.charAt(i) == 'L' && i + 2 < s.length() && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                return false;
            }
        }
        return true;
    }
}
