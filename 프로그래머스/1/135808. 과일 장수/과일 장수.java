import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        if(m > score.length) {
            return 0;
        }
        
        Integer[] boxedNumbers = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedNumbers, Comparator.reverseOrder());
        
        for (int i = 0; i < boxedNumbers.length/m; i++) {
            answer += boxedNumbers[m*i+m-1]*m;
        }
        
        return answer;
    }
}