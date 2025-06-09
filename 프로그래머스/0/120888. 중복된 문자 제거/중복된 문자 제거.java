import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        
        String answer = result.toString();
        return answer;
    }
}