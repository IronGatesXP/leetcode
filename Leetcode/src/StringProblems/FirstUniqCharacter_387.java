package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqCharacter_387 {
    public static int firstUniqChar(String s) {
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0;i < len;i++) {
            char c = s.charAt(i);
            if (map.get(c) != null) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }
        int index = Integer.MAX_VALUE;
        for (char c : map.keySet()) {
            if (map.get(c) == 1 && s.indexOf(c) < index) {
                index = s.indexOf(c);
            }
        }
        if (index == Integer.MAX_VALUE) {
            return -1;
        }
        return index;
    }

    public static int firstUniqCharOpti(String s) {
        for (int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            if (s.lastIndexOf(c) == s.indexOf(c)) {
                return i;
            }
        }
        return -1;
    }
}
