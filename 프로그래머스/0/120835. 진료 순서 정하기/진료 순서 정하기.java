import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];
        
        Integer[] sorted = new Integer[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = emergency[i];
        }

        Arrays.sort(sorted, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (emergency[i] == sorted[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}