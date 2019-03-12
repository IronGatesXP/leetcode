package test;

import java.util.Arrays;

public class ReverseVowelsString {
    public String reverseVowels(String s){
//        char[] c = s.toCharArray();
//        int len = 0;
//        for(int i=0;i<c.length;i++){
//            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
//                len++;
//            }
//        }
//        System.out.println(len);
//        char[] tmp = new char[len];
//        int j = 0;
//        for(int i=0;i<c.length;i++){
//
//            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
//                tmp[j++] = c[i];
//                c[i] = ' ';
//            }
//        }
//        System.out.println(Arrays.toString(tmp));
//        System.out.println(Arrays.toString(c));
//        char[] reverse = new char[len];
//        for(int i=0;i<len;i++){
//            reverse[i] = tmp[len - i - 1];
//        }
//        System.out.println(Arrays.toString(reverse));
//        int l = 0;
//        for(int i=0;i<c.length;i++){
//
//            if(c[i]==' '){
//                c[i] = reverse[l++];
//            }
//        }
//        System.out.println(Arrays.toString(c));
//        return new String(c);
        char[] c = s.toCharArray();
        int len = c.length;
        for(int i=0;i<len;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                while(c[len-1]!='a'&&c[len-1]!='e'&&c[len-1]!='i'&&c[len-1]!='o'&&c[len-1]!='u'&&c[len-1]!='A'&&c[len-1]!='E'&&c[len-1]!='I'&&c[len-1]!='O'&&c[len-1]!='U'&&(len>i)){
                    len--;
                }
                if(len>i){
//                    System.out.println(i);
//                    System.out.println(len);
                    char tmp = c[i];
                    c[i] = c[len-1];
                    c[len-1] = tmp;
                    len--;
                }
            }
        }
        return new String(c);

    }
    public static void main(String[] args){
        ReverseVowelsString rvs = new ReverseVowelsString();
        System.out.println(rvs.reverseVowels("AaEU"));
    }
}
