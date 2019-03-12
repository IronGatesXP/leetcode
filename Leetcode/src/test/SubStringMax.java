package test;

public class SubStringMax {
    public String subStringMax(String s){
        int MAXSIZE = 50;
        int len = s.length();
        int max = 0;
        int id = MAXSIZE;
        char[] str = s.toCharArray();
        char[] res = new char[MAXSIZE];
        for(int i=len-1;i>=0;i--)
        {
            if(str[i]>=max)
            {

                res[--id] = str[i];
                max = str[i];
            }
        }
        char[] result = new char[MAXSIZE-id];
        int j = 0;
        for(int i=id;i<MAXSIZE;i++)
        {
            System.out.println(res[i]);

        }
        return "true";
    }
    public static void main(String[] args){
        SubStringMax stm = new SubStringMax();

    }
}
