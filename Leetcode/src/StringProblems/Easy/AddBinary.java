package StringProblems.Easy;

public class AddBinary {
    public String addBinary(String a, String b) {
//        int len;
//        if(a.length()>b.length())
//            len = a.length();
//        else
//            len = b.length();
//        int[] a1 = stringToInteger(a,len);
//        int[] b1 = stringToInteger(b,len);
//        StringBuffer str = new StringBuffer(len+1);
//        int carry = 0;
//        for(int i = len-1;i>=0;i--){
//            int tmp = carry^a1[i]^b1[i];
//            if(carry+a1[i]+b1[i]>=2)
//                carry = 1;
//            else
//                carry = 0;
//            str.insert(0,tmp);
//        }
//        if(carry==1) {
//            str.insert(0, 1);
//            return str.toString();
//        }
//        else{
//            str.insert(0,0);
//            return  str.toString().substring(1);
//        }
//
//    }
//
//
//    public int[] stringToInteger(String s,int len){
//        int[] ib = new int[len];
//        for(int i = 0;i < s.length() ;i++){
//            ib[i+len-s.length()] = (int) s.charAt(i) - 48;
//        }
//        return ib;




    int lena = a.length();
    int lenb = b.length();
    int i =0, carry = 0;
    String res = "";
    while(i<lena || i<lenb || carry!=0){
        int x = (i<lena) ? Character.getNumericValue(a.charAt(lena - 1 - i)) : 0;
        int y = (i<lenb) ? Character.getNumericValue(b.charAt(lenb - 1 - i)) : 0;
        res = (x + y + carry)%2 + res;
        carry = (x + y + carry)/2;
        i++;
    }
    return res;
    }

    public static void main(String[] args) {
        AddBinary t = new AddBinary();

        System.out.println(t.addBinary("11","11"));
        // System.out.println(Arrays.toString(t.stringToInteger("110",5)));
    }
}
