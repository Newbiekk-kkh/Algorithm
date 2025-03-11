import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            String a = "";
            if(my_string.charAt(i) > 91) {
                a = String.valueOf(my_string.charAt(i));
                sb.append(a.toUpperCase());
            } else {
                a = String.valueOf(my_string.charAt(i));
                sb.append(a.toLowerCase());
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}