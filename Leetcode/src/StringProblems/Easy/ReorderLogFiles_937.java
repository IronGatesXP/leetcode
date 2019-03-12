package StringProblems.Easy;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ReorderLogFiles_937 {
    public static  String[] reorderLogFiles(String[] logs) {
        int len = logs.length;
        String[] res = new String[len];
        Map<String, Integer> map = new TreeMap<>();
        for (int i = len - 1; i >= 0; i--) {
            String[] words = logs[i].split(" ");
            if (words[1].charAt(0) >= '0' && words[1].charAt(0) <= '9') {
                res[--len] = logs[i];
            } else {
                String log = logs[i].replace(words[0]+ " ", "");
                map.put(log, i);
            }
        }
        int index = 0;
        for (String log : map.keySet()) {
            res[index++] = logs[map.get(log)];
        }
        for (String log : res) {
            System.out.println(log);
        }
        return res;
    }

    public static  String[] reorderLogFilesOpti(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2) {
                int cmp = split2[1].compareTo(split1[1]);
                if (cmp != 0) return cmp;
                return split2[0].compareTo(split1[0]);
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        for (String log : logs) {
            System.out.println(log);
        }
        return logs;
    }
}
