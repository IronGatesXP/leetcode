package StringProblems.medium;

import java.util.*;

public class MinimumTimeDifference_539 {
//    public static int findMinDifference(List<String> timePoints) {
//        Map<Integer, String> map = new HashMap<>();
//        for (String time : timePoints) {
//            if (time.equals("00:00")) {
//                map.put(1440, "");
//                map.put(0, "");
//            } else {
//                String[] pairs = time.split(":");
//                map.put(Integer.valueOf(pairs[0]) * 60 + Integer.valueOf(pairs[1]), "");
//            }
//        }
//        int res = Integer.MAX_VALUE;
//        int[] timeInt = new int[map.size()];
//        int index = 0;
//        for (int time : map.keySet()) {
//            timeInt[index++] = time;
//            System.out.println(time);
//        }
//        for (int i = 1; i < timeInt.length; i++) {
//            int timeDifference = timeInt[i] - timeInt[i - 1];
//            if (timeDifference < res) {
//                res = timeDifference;
//            }
//        }
//        return res;
//    }

    // 要考虑最小时间和最大时间之间可能存在比较小的差值，如00:35和23:50之间的差值比22:00和23:50之间的差值小但实际最小值应该是存在于前者
    public static int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        for (String time : timePoints) {
            String[] pairs = time.split(":");
            list.add(Integer.valueOf(pairs[0]) * 60 + Integer.valueOf(pairs[1]));
        }
        Collections.sort(list);
        int res = Integer.MAX_VALUE;
        for (int j = 1; j < list.size(); j++) {
            int timeDifference = list.get(j) - list.get(j - 1);
            if (timeDifference < res) {
                res = timeDifference;
            }
        }
        int temp = list.get(0) + 1440 -list.get(list.size() - 1);
        if (temp < res) {
            res = temp;
        }
        return res;
    }
}
