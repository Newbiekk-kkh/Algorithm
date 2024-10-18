class Solution {
    public double solution(double n) {
        double answer = 0;
        
        for (double i = 1; i <= n ; i++) {
            if (n/i == i) {
                answer = (i+1) * (i+1);
                break;
            } else {
                answer = -1;
            }
        }
        
        return answer;
    }                
}