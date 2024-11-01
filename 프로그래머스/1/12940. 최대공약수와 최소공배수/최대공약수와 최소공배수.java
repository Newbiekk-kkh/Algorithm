import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        List<Integer> a = new ArrayList<>();
        
        for (int i = 1 ; i <= n ; i++) {
            if (n%i == 0 && m%i == 0 ) {
                a.add(i);
            }
        }
        
        answer[0] = a.get(a.size()-1);
        
        for (long i = 1 ; i <= n*m ; i++) {
            if (i%n == 0 && i%m == 0) {
                answer[1] = (int)i;
                break;
            }
        }
        
        
        return answer;
    }
}