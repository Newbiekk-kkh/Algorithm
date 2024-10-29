import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] A = s.split(" ");
        int[] B = new int[A.length];
        String[] C = new String[2];
        
        for (int i = 0 ; i<A.length ; i++) {
            B[i] = Integer.parseInt(A[i]);
        }
        
        Arrays.sort(B);
        
        for (int i = 0 ; i<A.length ; i++) {
            A[i] = Integer.toString(B[i]);
        }
        
        C[0] = A[0];
        C[1] = A[A.length-1];
        
        answer = String.join(" ",C);
        
        return answer;
    }
}