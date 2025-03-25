class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String s = String.valueOf(num);
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k + 48) {
                answer = i+1;
                break;
            }
        }
        
        
        return answer;
    }
}