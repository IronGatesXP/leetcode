package StringProblems.Easy;

/**
 * @author XP
 * @date 2018/11/11 20:41
 */
public class GoatLatin {
    public static String goatLatin(String s) {
        String vowel = "aeiouAEIOU";
        String res = "";
        String[] words = s.split(" ");
        int count = 1;
        for (String word : words) {
//            System.out.println("word is " + word);
            String firstChar = word.substring(0,1);
            String temp = "";
            if (vowel.contains(firstChar)) {
                temp = word + "ma";
            } else {
                String secondString = word.substring(1, word.length());
                temp = secondString + firstChar + "ma";
            }
            for (int i = 0;i < count;i++) {
                temp += "a";
            }
            count++;
//            System.out.println("temp is " + temp);
            res += temp + " ";
        }
        return res.trim();
    }
}
