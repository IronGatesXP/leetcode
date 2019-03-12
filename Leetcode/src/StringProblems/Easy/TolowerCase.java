package StringProblems.Easy;

/**
 * @author XP
 * @date 2018/11/4 14:07
 */

/**
 * 这已经是最快的方法了
 */
public class TolowerCase {
    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0;i < chars.length;i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
