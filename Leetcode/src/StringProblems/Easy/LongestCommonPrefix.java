package StringProblems.Easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String prefix = strs[0];
        for(int i = 1 ;i < strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args)
    {
       LongestCommonPrefix t = new LongestCommonPrefix();
        String[] strs = {"string","strong","strng"};
        // System.out.println(nums.length);
        System.out.println(t.longestCommonPrefix(strs));
    }
}
