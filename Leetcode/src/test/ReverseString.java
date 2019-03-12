package test;

import java.util.Arrays;

public class ReverseString {
    public String reverseString(String s){
        char[] c = s.toCharArray();
        char[] tmp = new char[c.length];
        for(int i=0;i<c.length;i++){
            tmp[i] = c[c.length - i - 1];
        }
        System.out.println(Arrays.toString(tmp));
        return new String(tmp);
    }
    public static void main(String[] args){
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("hello"));
    }
}
