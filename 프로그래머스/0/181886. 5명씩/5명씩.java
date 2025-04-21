import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < names.length; i++) {
            if (i == 0 || i% 5 == 0) {
                list.add(names[i]);
            }
        }
        String[] answer = new String[list.size()];
        int count = 0;
        
        for (String s : list) {
            answer[count++] = s;
        }
    
        return answer;
    }
}