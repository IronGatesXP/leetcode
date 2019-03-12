package test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
//        StringBuffer bf = new StringBuffer();
//        Pattern p = Pattern.compile("[0-9]|[a-z]|[A-Z]");
//        for(int i = 0;i < s.length();i++) {
//            String str = s.substring(i, i + 1);
//            Matcher m = p.matcher(str);
//            if (m.matches())
//                //System.out.println(s);
//                bf.append(str);
//        }
//        String str1 = bf.toString().toLowerCase();
//        //System.out.println(str1);
//
//        bf.reverse();
//        String str2 = bf.toString();
//       //System.out.println(str2);
//        String str3 = str2.toLowerCase();
//        //System.out.println(str3);
//        if(str1.indexOf(str3)==0)
//            return true;
//        else
//            return false;
        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String rev = new StringBuffer(str).reverse().toString();
        return str.equals(rev);

    }
    public static void main(String[] args)
    {

        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome("race a car")+"");
    }
}
