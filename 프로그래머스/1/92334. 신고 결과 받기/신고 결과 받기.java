import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();

        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            result.put(id, 0);
        }
        
        
        for (String rep : report) {
            String[] parts = rep.split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            reportMap.get(reported).add(reporter);
        }

        for (String reported : reportMap.keySet()) {
            Set<String> reporters = reportMap.get(reported);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    result.put(reporter, result.get(reporter) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = result.get(id_list[i]);
        }

        return answer;
    }
}