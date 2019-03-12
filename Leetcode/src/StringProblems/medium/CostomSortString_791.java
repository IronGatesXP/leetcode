package StringProblems.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CostomSortString_791 {
    public static String customSortString(String S, String T) {
        char[] TC = T.toCharArray();
        int len = S.length();
        String[] resTemp = new String[len + 1];
//        for (int i = 0; i < len + 1; i++) {
//            resTemp[i] = "";
//        }
        Arrays.fill(resTemp, "");
        for (int i = 0; i < TC.length; i++) {
            String s = String.valueOf(TC[i]);
            int index = S.indexOf(s);
            if (index >= 0) {
                resTemp[index] += s;
            } else {
                resTemp[len] += s;
            }
        }
        String res = "";
        for (String str : resTemp) {
            res += str;
        }
        return res;
    }

    public static String customSortString2(String S, String T) {
        char[] SC = S.toCharArray();
        char[] TC = T.toCharArray();
        int[] countT = new int[26];
        for (int i = 0; i < TC.length; i++) {
            countT[TC[i] - 'a']++;
        }
        String res = "";
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < SC.length; i++) {
            int index = SC[i] - 'a';
            set.add(index);
            res += addChar(String.valueOf(SC[i]), countT[index]);
        }
        for (int i = 0; i < 26; i++) {
            if (!set.contains(i)) {
                char c = (char) (97 + i);
                res += addChar(String.valueOf(c), countT[i]);
            }
        }
        return res;
    }

    private static String addChar(String c, int number) {
        String str = "";
        for (int i = 0; i < number; i++) {
            str += c;
        }
        return str;
    }
}
