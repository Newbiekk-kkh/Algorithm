import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}