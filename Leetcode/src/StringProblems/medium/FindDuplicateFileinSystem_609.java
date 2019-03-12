package StringProblems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileinSystem_609 {
    public static List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> resList = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] pathPairs = path.split(" ");
            for (int i = 1; i < pathPairs.length; i++) {
                int start = pathPairs[i].indexOf("(");
                String content = pathPairs[i].substring(start, pathPairs[i].length());
                String finalPath = pathPairs[0] + "/" + pathPairs[i].substring(0,start);
                if (map.get(content) == null) {
                    List<String> list = new ArrayList<>();
                    list.add(finalPath);
                    map.put(content, list);
                } else {
                    map.get(content).add(finalPath);
                }
            }
        }
        for (String key :map.keySet()) {
            if(map.get(key).size() > 1) {
                resList.add(map.get(key));
            }
        }
        return resList;
    }
}
