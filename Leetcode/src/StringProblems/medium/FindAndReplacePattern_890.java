package StringProblems.medium;

import java.util.*;

public class FindAndReplacePattern_890 {
    private static String stringToCode(String str) {
        // index实际可以通过取map的大小获得，在这里用index++会比map.size()快
        int index = 0;
        StringBuilder res = new StringBuilder();
//        String res ="";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!map.containsKey(letter)) {
                map.put(letter, index++);
//                res += map.get(letter);
                res.append(map.get(letter));
            } else {
//                res += map.get(letter);
                res.append(map.get(letter));
            }
        }
//        System.out.println(res.toString());
        return res.toString();
    }

    // 使用String和StringBuilder的速度差不多，都只打败了23.91%。
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        String patternCode = stringToCode(pattern);
        for (String word : words) {
            String wordCode = stringToCode(word);
            if (patternCode.equals(wordCode)) {
                list.add(word);
            }
        }
        return list;
    }

    // 用index++的话会和之前没优化的速度一样，map.size()提高了速度？
    private  int[] stringToCodeOpti(String str) {
        int len = str.length();
        int[] res = new int[len];
//        int index = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            char letter = str.charAt(i);
            map.putIfAbsent(letter, map.size());
//            map.putIfAbsent(letter, index++);
            res[i] = map.get(letter);
        }
//        System.out.println(res.toString());
        return res;
    }
    // 80.7%
    public List<String> findAndReplacePatternOpti(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        int[] patternCode = stringToCodeOpti(pattern);
        for (String word : words) {
            if (Arrays.equals(stringToCodeOpti(word), patternCode)) {
                list.add(word);
            }
        }
        return list;
    }


}
