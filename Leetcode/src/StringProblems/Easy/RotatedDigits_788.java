package StringProblems.Easy;

public class RotatedDigits_788 {
    static public int rotatedDigits(int N) {
        int count  = 0;
        for (int i = 1; i <= N; i++) {
            String str = Integer.toString(i);
            if (str.contains("3") || str.contains("4") || str.contains("7")) {
                continue;
            } else {
                if (str.contains("2") || str.contains("5") || str.contains("6") || str.contains("9")) {
                    count++;
                }
            }
        }
        return  count;
    }
}
