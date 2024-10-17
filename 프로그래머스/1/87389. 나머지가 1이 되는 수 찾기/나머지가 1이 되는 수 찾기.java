class Solution {
    public int solution(int n) {
        int x = 0;
        x = n-1;
        
        for (int i=2 ; i<=x ; i++) {
            if (x%i == 0) {
                x = i;
                break;
            }
        }
        return x;
    }
}