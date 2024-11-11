class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0;
        
        for (int i = 1 ; i <= count ; i++) {
            cost += price * i ;
        }
        
        
        if (cost - money <= 0) {
            return 0;
        } else {
            return cost-money;
        }
        
    }
}