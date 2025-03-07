import java.util.*;

class Solution
{
    public int solution(int[] A, int[] B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int[] C = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            C[i] = A[A.length - i -1];
        }
        
        for (int i = 0; i < A.length; i++) {
            answer += C[i] * B[i];
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}