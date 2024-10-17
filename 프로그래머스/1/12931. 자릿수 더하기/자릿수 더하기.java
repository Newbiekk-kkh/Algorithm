import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        
        for (int i = 0 ; i < 9 ; i++) {
            sum += n%10;
            n = n/10;
        }
        
        return sum ;
    }
}