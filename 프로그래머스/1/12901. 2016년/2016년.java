class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] monthDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int sum = 0;
        int answerIndex = 0;
        
        if (a > 1) {
            for (int i = 0; i < a-1; i++) {
                sum += monthDay[i];
            }
        }
        sum += b;
        
        answerIndex = sum % 7;
        
        answer = day[answerIndex];
        
        
        return answer;
    }
}