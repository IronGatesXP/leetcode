package test;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
//        if(s.charAt(s.length()-1)==' ')
//            return 0;
//        else{
//            String[] str = s.split(" ");
//            return str[str.length-1].length();
//        }
        String[] str = s.split(" ");
        if(str.length==0)
            return 0;
        else
            return str[str.length-1].length();

    }

    public static int lengthOfLastWordOpti(String s) {
        s = s.trim();
        int count = 0;
        int len = s.length();
        for (int i = len - 1; i >=0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        LengthOfLastWord t = new LengthOfLastWord();

        System.out.println(t.lengthOfLastWord("hello "));
    }
}
