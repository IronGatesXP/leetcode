package StringProblems;

public class CountBinarySubstrings_696 {
    static public int countBinarySubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(i);
            int size = 1;
            int t = i;
            System.out.println(t);
            while (t < s.length() - 1 && s.charAt(t) == s.charAt(t + 1)) {
                t++;
                size++;
            }
//            int pre = Integer.parseInt(s.substring(i, t + 1));
//            int suf = Integer.parseInt(s.substring(t + 1, t + size + 1));
//            if (pre & suf) {
//
//            }
            String sub = s.substring(t + 1, t + size + 1);
//            boolean flag = true;
//            for (int j = 0; j < sub.length() - 1; j++) {
//                if (s.charAt(j) != s.charAt(j + 1)) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                count++;
//            }
        }
        return count;
    }
}
