class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0 && i >= yellow / i) {
                x = i;
                y = yellow / i;
                
                if (brown == (2 * x) + (2 * y) + 4) {
                    break;
                }
            }
        }
        
        answer[0] = x+2;
        answer[1] = y+2;
        
        return answer;
    }
}