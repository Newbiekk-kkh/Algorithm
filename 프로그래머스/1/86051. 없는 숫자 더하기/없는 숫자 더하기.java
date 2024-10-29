class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        
        for (int i = 0 ; i < numbers.length ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                if (numbers[i] == j) {
                    sum += j;
                }
            }
        }
        
        answer = 45 - sum;
        
        return answer;
    }
}