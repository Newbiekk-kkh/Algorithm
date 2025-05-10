class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int count = 0;
        
        for (int num : arr) {
            if (num >= 50 && num % 2 == 0) {
                num /= 2;
            } else if (num < 50 && num % 2 == 1) {
                num *= 2;
            }
            answer[count] = num;
            count++;
        }
        
        return answer;
    }
}