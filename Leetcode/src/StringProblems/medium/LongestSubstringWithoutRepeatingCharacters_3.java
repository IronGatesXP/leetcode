package StringProblems.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    /**
     * 如果[i,j)已经不包括重复元素的子字符串，那么只需要判断j是否是重复元素即可，
     * 如果不是则增加最长子字符串的长度
     * 如果是则需要另外找寻一个起点i，和j相同的元素前的所有元素都应删除，这样才能保证新的子字符串不会有重复的元素
     */
    public int lengthOfLongestSubstring1(String s) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        int res = 0;
        int i = 0;
        int j = 0;
        while (i < len && j < len) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                res = Math.max(res, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return res;
    }

    // 37.25%
    public static int lengthOfLongestSubstring2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        int res = 0;
        // left代表滑动窗开始的第一个字母的左一位，可以直接用i-left计算滑动窗的长度
        int left = -1;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            // map.get(c) > left用来判断重复的字母是在滑动窗内 ，而不考虑滑动窗范围外的
            if (map.containsKey(c) && map.get(c) > left) {
                left = map.get(c);
            }
            map.put(c, i);
            // 每次都计算滑动窗的长度，不需要等到有重复的字母出现的时候才计算
            res = Math.max(res, i - left);
        }
        return res;
//        int j = 0;
//        while (i < len && j < len) {
//            if (map.containsKey(s.charAt(j))) {
//                i = map.get(s.charAt(j)) + 1;
//            }
//            res = Math.max(res, j - i + 1);
//            map.put(s.charAt(j), j);
//            j++;
//        }
//        return res;
    }

    // 只打败了9.73%
    // 因为需要知道字母对应的index所以可以用map来存放
    public static int lengthOfLongestSubstring3(String s) {
        int len = s.length();
        String subS = "";
        int count = 0;
        int maxLen = 0;
        for (int i = 0; i < len; ) {
            String c = String.valueOf(s.charAt(i));
            if (!subS.contains(c)) {
                count++;
                i++;
                subS = subS + c;
            } else {
                if (count > maxLen) {
                    maxLen = count;
                }
                i = i - subS.length() + subS.indexOf(s.charAt(i)) + 1;
                count = 0;
                subS = "";
            }
        }
        return count > maxLen ? count : maxLen;
    }
}
