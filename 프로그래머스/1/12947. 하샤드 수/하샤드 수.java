class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int tempNum = x;
        
        while (tempNum >=1) {
            sum += tempNum % 10;
            tempNum /= 10;
        }
        
        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        
        return answer;
    }
}