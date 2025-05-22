import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> nameMap = new HashMap<>();
        
        for (String name : participant) {
            nameMap.put(name, nameMap.getOrDefault(name, 0) + 1);
        }
        
        for (String name : completion) {
            nameMap.put(name, nameMap.get(name) - 1);
        }
        
        for (String name : participant) {
            if (nameMap.get(name) != 0) {
                return name;
            }
        }
        
        
        return answer;
    }
}