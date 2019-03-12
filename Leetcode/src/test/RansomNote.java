package test;

import java.util.Arrays;

public class RansomNote {
    public boolean canConstruct(String ransomNote,String magazine){
        // char[] c = new char[ransomNote.length()];
        char[] rn = ransomNote.toCharArray();
        System.out.println(Arrays.toString(rn));
        char[] mg = magazine.toCharArray();
        Arrays.sort(mg);
        System.out.println(Arrays.toString(mg));
        for(int i=0;i<ransomNote.length();i++){
            if(Arrays.binarySearch(mg,rn[i])>=0){
                System.out.println(rn[i]);
                mg[Arrays.binarySearch(mg,rn[i])] = ' ';
                Arrays.sort(mg);
                System.out.println(Arrays.toString(mg));
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        RansomNote r = new RansomNote();
        System.out.println(r.canConstruct("b","dhhbh"));
    }
}
