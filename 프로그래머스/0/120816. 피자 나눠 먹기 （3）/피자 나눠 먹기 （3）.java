class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        answer = n / slice + (n % slice > 0 ? 1 : 0);
        return answer;
    }
}