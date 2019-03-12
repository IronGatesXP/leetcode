package StringProblems;

public class RepeatedStringMatch_686 {
    public static int repeatedStringMatch(String A, String B) {
        String str = "";
        int times = B.length() / A.length() + 2;
        for (int i = 1; i <= times; i++) {
            str += A;
            if (str.contains(B)) {
                return i;
            }
        }
        return -1;
    }
}
