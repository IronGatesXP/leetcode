package StringProblems;

public class TestTime {
    private static void toArray(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    private static void charAt(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void testTime(String s) {
        long startTime1 = System.nanoTime();
        toArray(s);
        long endTime1 = System.nanoTime();
        charAt(s);
        long endTime2 = System.nanoTime();
        System.out.println(endTime1 - startTime1);
        System.out.println(endTime2 - endTime1);
    }
}
