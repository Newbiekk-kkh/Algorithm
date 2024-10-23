class Solution {
    public int solution(int num) {
        long longNum = num ;
        int answer = 0;
        
        if (longNum == 1) {
            return answer = 0 ;
        } else{
             do {
            if (longNum%2==0) {
                longNum = longNum / 2;
            } else {
                longNum = longNum * 3 + 1 ;
            }
            answer++;
            if (answer>=500) {
                return answer = -1;
            }
            } while (longNum != 1);
        }
            return answer;            
    }
}