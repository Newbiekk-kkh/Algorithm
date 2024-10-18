class Solution {
    public long[] solution(long n) {
        long[] answer = {};
        int lengthN = 1;
        long a = n ;
        long tempNum = 0;
        
        while (a >= 10) {
            a /= 10;
            lengthN++;
        }
        
        answer = new long[lengthN];
        
        for (int i = 0 ; i<lengthN ; i++) {
            tempNum = n % 10;
            n /= 10;
            answer[i] = tempNum;
        }
        return answer;
    }
}