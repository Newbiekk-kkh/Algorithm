import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for (int i=1 ; i<food.length ; i++) {
            for (int j = 0; j < food[food.length-i]/2; j++)
            answer = String.valueOf(food.length-i) + answer + String.valueOf(food.length-i);
        }
        
        return answer;
    }
}