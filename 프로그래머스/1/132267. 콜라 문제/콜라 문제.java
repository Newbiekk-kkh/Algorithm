class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
    
        while ((n/a) > 0) {
            int count = 0;
            count = (n/a) * b;
            n = (n%a) + count;
            answer += count;        
        }
        
        return answer;
    }
}