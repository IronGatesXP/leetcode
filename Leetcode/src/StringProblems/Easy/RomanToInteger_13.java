package StringProblems.Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public static int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int index = s.length() - 1;
        while(index >= 0) {
            char roman = s.charAt(index);
            res += map.get(roman);
            if (index > 0) {
                char romanNext = s.charAt(index - 1);
                // 下面三种情况可以总结为一种情况，就是如果当前罗马数字代表的数值比右边大的话就加，小的话就减（顺序从右向左）
                if ((roman == 'V' || roman == 'X') && romanNext == 'I') {
                    res -= 1;
                    index -= 2;
                    continue;
                }
                if ((roman == 'L' || roman == 'C') && romanNext == 'X') {
                    res -= 10;
                    index -= 2;
                    continue;
                }
                if ((roman == 'D' || roman == 'M') && romanNext == 'C') {
                    res -= 100;
                    index -= 2;
                    continue;
                }
            }
            index--;
        }
        return res;
    }

    public static int romanToIntOptimization(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        // 关键是要把最后一个数的情况单独作为一个判断条件，因为最后一个数没有下一个，会导致IndexOut
        for (int i = 0;i < s.length();i++) {
            int integer = map.get(s.charAt(i));
            if (i == s.length() - 1 || integer >= map.get(s.charAt(i + 1))) {
                res += integer;
            } else {
                res -= integer;
            }
        }
        return res;
    }
}
