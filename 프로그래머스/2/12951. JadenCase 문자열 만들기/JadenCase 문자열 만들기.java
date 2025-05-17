import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        if (s.charAt(0) >= '0' && s. charAt(0) <= 'z') {
            sb.append(Character.toUpperCase(s.charAt(0)));
        }
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}