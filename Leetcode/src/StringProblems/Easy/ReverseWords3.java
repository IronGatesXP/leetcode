package StringProblems.Easy;

/**
 * @author XP
 * @date 2018/11/4 14:59
 */
public class ReverseWords3 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reverseWord;
        String reverseWords = "";
        for (int i = 0;i < words.length;i++) {
            reverseWord = new StringBuilder(words[i]);
            reverseWord.reverse();
            reverseWords += reverseWord.toString();
            if (i != words.length - 1) {
                reverseWords += " ";
            }
        }
        return reverseWords;
    }

    public static String reverseWordsList(String s) {
        String[] words = s.split(" ");
        char[] chars;
        int len;
        String reverseWords = "";
        for(int j = 0;j < words.length;j++) {
            chars = words[j].toCharArray();
            len = chars.length;
            for (int i = 0;i < len / 2;i++) {
                char temp = chars[i];
                chars[i] = chars[len - 1 - i];
                chars[len - 1 - i] = temp;
            }
                reverseWords += new String(chars) + " ";
        }
        return reverseWords.trim();
    }

    public static String reverseWordsMostEffictive(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }
}
