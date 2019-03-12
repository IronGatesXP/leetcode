package StringProblems.Easy;

import java.util.Arrays;

public class ReverseString_541 {
    public static String reverseStr(String str, int k) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = 2 * k - 1;
        int len = str.length();
        while (right < len) {
            int i = left;
            int j = right - k;
            reverse(chars, i, j);
            left += 2 * k;
            right += 2 * k;
        }
        if (right != len - 1 + 2 * k) {
            right = len - 1;
            if (right - left < k) {
                System.out.println("low");
                reverse(chars, left, right);
            } else {
                System.out.println("high");
                reverse(chars, left, left + k - 1);
            }
        }
        return new String(chars);
//        return Arrays.toString(chars);
//        return chars.toString();
    }

    private static void reverse(char[] chars, int left, int right) {
        for (int i = left, j = right;i < j;i++,j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }

    public static String reverseStrOpti(String s, int k) {
        char[] a = s.toCharArray();
        int len = a.length;
        for (int i = 0; i < len; i += 2 * k) {
            int start = i;
            int end = Math.min(start + k - 1, len);
            while (start < end) {
                char temp = a[start];
                a[start++] = a[end];
                a[end--] = temp;
            }
        }
        return new String(a);
    }
}
