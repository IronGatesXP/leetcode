package StringProblems.Easy;

import java.util.*;

/**
 * @author XP
 * @date 2018/11/4 16:53
 */
public class SpecialEquivalentStrings {
    public static int numSpecialEquivGroups(String[] A) {
        int len = A[0].length();
        int count = A.length;
        char[] charAtOddIndex = new char[len / 2];
        char[] charAtEvenIndex = new char[len - charAtOddIndex.length];
        List<String> list = new ArrayList<>();
        for (String word : A) {
            int oddIndex = 0;
            int evenIndex = 0;
            char[] chars = word.toCharArray();
            for (int i = 0;i < len;i++) {
                if(i % 2 == 0) {
                    charAtEvenIndex[evenIndex++] = chars[i];
                } else {
                    charAtOddIndex[oddIndex++] = chars[i];
                }
            }
            Arrays.sort(charAtEvenIndex);
            Arrays.sort(charAtOddIndex);
            String res = new String(charAtEvenIndex) + new String(charAtOddIndex);
            if(list.contains(res)) {
                count--;
            } else {
                list.add(res);
            }
        }
        return count;
    }

    public static int numSpecialEquivGroupsMoreEffective(String[] A) {
        Set<String> groups = new HashSet<>();
        for (String str : A) {
            int[] count = new int[52];
            for (int i = 0;i < str.length();i++) {
                count[str.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            System.out.println(count.toString());
            System.out.println(Arrays.toString(count));
            groups.add(Arrays.toString(count));
        }
        return groups.size();
    }
}
