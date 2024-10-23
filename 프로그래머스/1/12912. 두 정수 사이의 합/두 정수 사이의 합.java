class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;

        if (a <= b) {
            for (int i = 0; a + i <= b; i++) {
                if (a == b) {
                    answer = a;
                    break;
                } else {
                    sum += (a + i);
                    answer = sum;
                }
            }
        } 
        
        if (a>=b) {
            for (int i = 0; b + i <= a; i++) {
                if (a == b) {
                    answer = a;
                    break;
                } else {
                    sum += (b + i);
                    answer = sum;
                }
            }
        }

        return answer;
    }
}