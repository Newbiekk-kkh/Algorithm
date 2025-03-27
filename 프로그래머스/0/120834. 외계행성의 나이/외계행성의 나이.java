import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder sb = new StringBuilder();
        
        if (age == 1000) {
            return answer = "baaa";
        }
        
        if (age / 100 >= 1) {
            int a = age % 10;
            age = age / 10;
            int b = age % 10;
            age = age / 10;
            int c = age % 10;
            
            sb.append(s[c]);
            sb.append(s[b]);
            sb.append(s[a]);
            
            return sb.toString();
        }
        
        if (age / 10 >= 1) {
            int a = age % 10;
            age = age / 10;
            int b = age % 10;
            
            sb.append(s[b]);
            sb.append(s[a]);
            
            return sb.toString();
        }
        
        if (age / 10 < 1) {
            int a = age % 10;
            
            sb.append(s[a]);
            
            return sb.toString();
        }
        
        return answer;
    }
}