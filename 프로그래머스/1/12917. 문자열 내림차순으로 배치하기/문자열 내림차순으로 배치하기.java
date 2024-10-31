import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] A = s.split("");
        Arrays.sort(A, Comparator.reverseOrder());
        answer = String.join("",A);
        
        
        return answer;
    }
}