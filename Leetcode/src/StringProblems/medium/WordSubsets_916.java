package StringProblems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSubsets_916 {
    public static List<String> wordSubsets(String[] A, String[] B) {
        List<String> res = new ArrayList<>();
        Map<Character, Integer> maxMap = new HashMap<>();
        for (String b : B) {
            Map<Character, Integer> bMap = count(b);
            for (int i = 97; i < 97 + 26; i++) {
                char c = (char) i;
                int bCount = bMap.getOrDefault(c, 0);
//                System.out.println("bcount is " + bCount);
                int maxCount = maxMap.getOrDefault(c, 0);
                maxMap.put(c, Math.max(bCount, maxCount));
            }
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : maxMap.keySet()) {
            int count = maxMap.get(c);
            if (count != 0) {
                map.put(c, count);
//                System.out.println("key is " + c + " count is " + maxMap.get(c) );
            }
        }
        for (String a : A) {
            if (bIsaSubset(a, map)) {
                res.add(a);
            }
        }
        return res;
    }

    private static boolean bIsaSubset(String a, Map<Character, Integer> bMap) {
        Map<Character, Integer> aMap = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char key = a.charAt(i);
            aMap.put(key, aMap.getOrDefault(key, 0) + 1);
        }
        for (char c : bMap.keySet()) {
            Integer bCount = bMap.get(c);
            Integer aCount = aMap.get(c);
//            System.out.println("count " + count);
            if (bCount == null || aCount == null || bCount > aCount ) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map;
    }
}
