class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmpNum = n / 2;
        for (int i=1 ; i<=tmpNum;i++) {
            answer += i;
        }
        answer = 2 * answer;
        return answer;
    }
}