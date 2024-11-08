import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = 0;
        for (int i = 1 ; i <= n ; i++) {
            if (n%i == 0 && m%i == 0 ) {
                a = i;
            }
        }
        
        answer[0] = a;
        
        for (long i = 1 ; i <= n*m ; i++) {
            if (i%n == 0 && i%m == 0) {
                answer[1] = (int)i;
                break;
            }
        }
        
        
        return answer;
    }
}