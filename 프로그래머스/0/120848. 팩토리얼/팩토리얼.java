class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= 11; i++) {
            if (f(i) > n) {
                return answer = i - 1;
            }
        }
        
        return answer;
    }
    
    static int f(int num) {
        if (num == 0) {
            return 1;
        }
        return num * f(num - 1);
    }
}