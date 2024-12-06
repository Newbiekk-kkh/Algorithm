class Solution {
    public int solution(int n) {
        int pizza = 6;
        int a = 0;
        
        for (int i = 1; i <= 6; i++) {
            if(pizza%i ==0 && n%i==0) {
                a = i;
            }
        }
        
        
        return n*pizza/a/pizza;
    }
}