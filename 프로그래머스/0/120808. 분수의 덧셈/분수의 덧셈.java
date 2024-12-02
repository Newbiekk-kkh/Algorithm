class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = 0;
        
        for (int i= 1; i <1000 ; i++) {
            if(denom1%i==0 && denom2 %i ==0) {
                a = i;
            }
        }
        
        int b = 0;
        
        b = a * (denom1/a) * (denom2/a); // 최소 공배수
        
        
        
        numer1 = b/denom1 * numer1;
        numer2 = b/denom2 * numer2;
        
        answer[0] = numer1+numer2;
        answer[1] = b;
        
        if (answer[0] == answer[1]) {
            answer[0] = 1;
        answer[1] = 1;
            return answer;
        }
        
        for (int i= 1; i <1000 ; i++) {            
            if(answer[0] % i == 0 && answer[1] % i ==0) {
                answer[0] /= i;
                answer[1] /= i;
            }
        }  
        
        
        return answer;
    }
}