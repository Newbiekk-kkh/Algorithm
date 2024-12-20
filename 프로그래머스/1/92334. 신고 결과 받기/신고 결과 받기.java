import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();
        
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            resultMap.put(id, 0);
        }
        
        for (String s : report) {
            String[] str = s.split(" ");
            reportMap.get(str[1]).add(str[0]);
        }
        
        for (String reported : reportMap.keySet()) {
            if (reportMap.get(reported).size() >= k) {
                for (String reporter : reportMap.get(reported)) {
                    resultMap.put(reporter, resultMap.get(reporter) + 1);
                }
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = resultMap.get(id_list[i]);
        }
        
        return answer;
    }
}