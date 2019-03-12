package StringProblems.Easy;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuffer[] str = new StringBuffer[n];
        str[0] = new StringBuffer("1");
        for(int i = 1;i < n;i++){
            str[i] = new StringBuffer();
            StringBuffer pres = str[i-1];
            char c = pres.charAt(0);
            int count = 1;
            for(int j = 1;j < pres.length();j++){
                if(c==pres.charAt(j))
                    count++;
                else{
                    str[i].append(count).append(c);
                    c = pres.charAt(j);
                    count = 1;
                }
            }
            str[i].append(count).append(c);
        }
        return str[n-1].toString();

    }
    public static void main(String[] args)
    {
        CountAndSay t = new CountAndSay();

        System.out.println(t.countAndSay(5));
    }
}
