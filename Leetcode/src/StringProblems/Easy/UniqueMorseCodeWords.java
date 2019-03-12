package StringProblems.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XP
 * @date 2018/11/4 14:35
 */
public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] encodeList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, String> map = new HashMap<>();
        char[] chars;
        for (String word : words) {
            String morseCode = "";
            chars = word.toCharArray();
            for (char c : chars) {
                morseCode += encodeList[(c - 97) % 26];
                System.out.println(morseCode);
            }
            map.put(morseCode, "");
        }
        return map.size();
    }
}
