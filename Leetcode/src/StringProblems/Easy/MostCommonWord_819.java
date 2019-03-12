package StringProblems.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord_819 {
    // 这种方法解决不了"a, a, a, a, b,b,b,c, c"
    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] strs = paragraph.toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        String word = "";
        for (String str : strs) {
            if (str.endsWith(",") || str.endsWith("!") || str.endsWith("?") || str.endsWith("'") || str.endsWith(";") || str.endsWith(".")) {
                str = str.substring(0, str.length() - 1);
            }
            if (map.get(str) != null) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
            word = str;
        }
        for (String bannedStr : banned) {
            map.put(bannedStr, 0);
        }

        for (String key : map.keySet()) {
            if (map.get(word) < map.get(key)) {
                word = key;
            }
        }
        return word;
    }

    public static String mostCommonWordOpti(String paragraph, String[] banned) {
//        String[] words = paragraph.toLowerCase().split(" |!|\\?|'|;|\\.|,");
        String[] words = paragraph.toLowerCase().split(".");
//
        Set<String> bannedSet = new HashSet<>();
        for (String str : banned) {
            bannedSet.add(str);
        }
        Map<String, Integer> map = new HashMap<>();
        String res = "";
        int count = 0;
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
            // 因为当两个分隔符之间没有任何字符时就会得到""
            if(!bannedSet.contains(word) && !word.equals("")) {
                map.put(word, map.getOrDefault(word, 0) + 1);
                if (map.get(word) > count) {
                    res = word;
                    count = map.get(word);
                }
            }
        }
        return res;
    }
}
