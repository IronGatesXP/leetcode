package StringProblems.medium;

import java.util.Arrays;

public class FindAndReplaceinString_833 {
    // 时间超时
    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        String res = S;
        String[] tempRes = new String[indexes.length + 1];
        tempRes[0] = S;
        for (int i = 0; i < indexes.length; i++) {
            System.out.println(S.indexOf(sources[i]));
            if (S.indexOf(sources[i]) == indexes[i]) {
                System.out.println(targets[i]);
                tempRes[i + 1] = tempRes[i].replace(sources[i], targets[i]);
            }
        }
        return tempRes[indexes.length];
    }

    // 只能处理indexes中下标是从小到大排序的情况，如果不是则处理不了，如[3,5,1]，前两个都可以处理，但1会漏掉
    public static String findReplaceStringOpti(String S, int[] indexes, String[] sources, String[] targets) {
        char[] sc = S.toCharArray();
        StringBuilder res = new StringBuilder();
        int j = 0;
        for (int i = 0; i < sc.length; ) {
            if (j < indexes.length && i == indexes[j]) {
                String temp = S.substring(i, i + sources[j].length());
                System.out.println(temp);
                if (temp.equals(sources[j])) {
                    res.append(targets[j]);
                    i += sources[j].length();
                }
                j++;
            } else {
                res.append(sc[i++]);
            }
        }
        return res.toString();
    }

    public static String findReplaceStringOpti2(String S, int[] indexes, String[] sources, String[] targets) {
        // 先将是否相等的情况判断出来
        int N = S.length();
        int[] match = new int[N];
        Arrays.fill(match, -1);
        for (int i = 0; i < indexes.length; i++) {
            int index = indexes[i];
            if (sources[i].equals(S.substring(index, index + sources[i].length()))) {
                match[index] = i;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < N;) {
            if (match[i] >= 0) {
                res.append(targets[match[i]]);
                i += sources[match[i]].length();
            } else {
                res.append(S.charAt(i++));
            }
        }
        return res.toString();
    }
}
