import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        int[] answer = new int[str.length];
        int count = 1;
        
        answer[0] = -1;
        
        for (int i = 1 ; i < str.length ; i++) {
            for (int j = 0; j < i ; j++) {
                if (str[j].equals(str[i])) {
                    answer[count] = i - j;
                }
                if (answer[count] == 0) {
                    answer[count] = -1;
                }
            }
            count++;
        }
        
        return answer;
    }
}