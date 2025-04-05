class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        for (int target : num_list) {
           if (target == n) {
               answer = 1;
           }
        }
        
        return answer;
    }
}