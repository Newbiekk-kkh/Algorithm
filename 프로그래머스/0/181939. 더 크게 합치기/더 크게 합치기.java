class Solution {
    public int solution(int a, int b) {
        String A = "" + a;
        String B = "" + b;
        
        String AB = A+B;
        String BA = B+A;
        
        int ab = Integer.parseInt(AB);
        int ba = Integer.parseInt(BA);

        return ab >= ba ? ab : ba ;
    }
}