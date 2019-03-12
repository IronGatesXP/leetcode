package StringProblems;

/**
 * @author XP
 * @date 2018/11/11 20:16
 */
public class MaxSameSubString {
    public static String getMaxSameSubString(String a, String b) {
        String max = a.length() > b.length() ? a : b;
        String min = max.equals(a) ? b : a;
        System.out.println("max is " + max);
        System.out.println("min is " + min);
        for (int i = 0;i < min.length();i++) {
            for (int j = 0, k = min.length() - i;k != min.length() + 1;j++, k++) {
                String temp = min.substring(j, k);
                // 因为切断min的时候是从最大长度到最小长度，所以当max中存在切出来的submin时，一定就是最长相同子字符串，缺点是当有多个相同的长度的子字符串时只会输出一个
                if (max.contains(temp)) {
                    return temp;
                }
            }
        }
        return "";
    }
}
