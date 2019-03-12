package StringProblems.medium;

import java.util.*;

public class GroupAnagrams_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] a = new int[26];
            for (int i = 0; i < str.length(); i++) {
                a[str.charAt(i) - 'a']++;
            }
            String key =Arrays.toString(a);
//            System.out.println(key);
            if (map.get(key) != null) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String key: map.keySet()) {
            res.add(map.get(key));
        }
        return res;
    }
}
