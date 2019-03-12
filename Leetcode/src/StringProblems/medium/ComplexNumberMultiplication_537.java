package StringProblems.medium;

public class ComplexNumberMultiplication_537 {
    public static String complexNumberMultiply(String a, String b) {
        int[] array = new int[4];
        String[] s = a.split("\\+");
        array[0] = Integer.valueOf(s[0]);
        array[1] = Integer.valueOf(s[1].substring(0, s[1].length() - 1));
        s = b.split("\\+");
        array[2] = Integer.valueOf(s[0]);
        array[3] = Integer.valueOf(s[1].substring(0, s[1].length() - 1));
        int aInt = array[0] * array[2] - array[1] * array[3];
        int bInt = array[0] * array[3] + array[1] * array[2];
        return aInt + "+" + bInt + "i";
    }
}
