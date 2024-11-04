class Solution {
    public double solution(double n) {
        double answer = 0;
        
        for (double x = 1; x <= n ; x++) {
            if (n/x == x) {
                answer = (x+1) * (x+1);
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }                
}