class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for (int i = 0 ; i < number.length ; i++) {
            for (int j = 0; j < number.length ; j++) {
                for (int k = 0; k < number.length ; k++) {
                    if (i<j && j<k) {
                        if (number[i] + number[j] + number[k] == 0) {
                            answer++;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}