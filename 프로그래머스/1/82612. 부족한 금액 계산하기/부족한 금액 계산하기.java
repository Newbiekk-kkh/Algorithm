class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for (int i = 1 ; i <= count ; i++) {
            sum = sum + (i * price);
        }
        
        if (money >= sum) {
            answer = 0;
        } else {
            answer = sum - money;
        }
        
        return answer;
    }
}