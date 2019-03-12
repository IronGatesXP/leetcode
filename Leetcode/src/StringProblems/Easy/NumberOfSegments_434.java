package StringProblems.Easy;

/**
 * 需要注意的情况就是""和", , , ,        a, eaefa"这两种情况的出现，排除这两种情况即可。
 */
public class NumberOfSegments_434 {
    public static int countSegments(String s) {
        String[] strs = s.split(" ");
        int len = strs.length;
        for (String str : strs) {
            System.out.println(str);
            if ("".equals(str) || " ".equals(str)) {
                len--;
            }
        }
        return len;
    }
}
