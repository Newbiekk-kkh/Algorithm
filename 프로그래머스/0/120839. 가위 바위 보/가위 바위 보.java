import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '0') {
                sb.append("5");
            } else if (rsp.charAt(i) == '2') {
                sb.append("0");
            } else {
                sb.append("2");
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}