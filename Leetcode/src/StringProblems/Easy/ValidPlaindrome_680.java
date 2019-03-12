package StringProblems.Easy;

public class ValidPlaindrome_680 {
    // 把首次不相等的两个字符删掉判断是否是回文，如果都不是则返回false
    public static boolean validPalindrome(String s) {
        if (isPalindrome(s)) {
            return true;
        }
        int len = s.length();
        int index = 0;
        for (;index < len / 2;index++) {
            if (s.charAt(index) != s.charAt(len - index - 1)) {
                break;
            }
        }
        char c1 = s.charAt(index);
        char c2 = s.charAt(len - index - 1);
        String str1 = s.substring(0, index) + s.substring(index + 1);
        String str2 = s.substring(0, len - index - 1) + s.substring(len - index);
        if (isPalindrome(str1) || isPalindrome(str2)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0;i < len / 2;i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 要充分利用之前的比较过程，因为在没遇到不相等的字符前的左右字符字符已经判断过满足条件了，所以没有必要再进行一次多余的判断了
    // 利用left+1和right-1的形式，可以省略之前已经比较过的字符的再次比较，也可以省略截取字符串的操作。
    public static boolean validPalindromeOpti(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isValid(s, left + 1, right) || isValid(s, left, right - 1);
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private static boolean isValid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
