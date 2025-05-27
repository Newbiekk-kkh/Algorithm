class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a != b && b != c && a != c) {
            return a + b + c;
        }
        
        if (a == b && b != c) {
            return (a + b + c) * (a*a + b*b + c*c);
        }
        
        if (a == c && c != b) {
            return (a + b + c) * (a*a + b*b + c*c);
        }

        if (b == c && b != a) {
            return (a + b + c) * (a*a + b*b + c*c);
        }
        
        if (a == b && b == c) {
            return (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        }
        
        return answer;
    }
}