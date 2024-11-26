class Solution {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        
        for (int a : num_list) {
            if (a % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        int[] answer = {even, odd};
        return answer;
    }
}