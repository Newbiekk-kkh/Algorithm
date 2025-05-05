import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> ls = new ArrayList<>();
        
        for (String s : strArr) {
            if(!s.contains("ad")) {
                ls.add(s);
            }
        }
        
        String[] answer = new String[ls.size()];
        
        for (int i = 0; i < ls.size(); i++) {
            answer[i] = ls.get(i);
        }
        
        return answer;
    }
}