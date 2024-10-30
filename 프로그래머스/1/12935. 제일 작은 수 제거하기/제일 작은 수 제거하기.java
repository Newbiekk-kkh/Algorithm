import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] A = new int[arr.length];
        int count = 0;
        
        if (arr.length == 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = new int[arr.length-1];
            
            for (int i=0 ; i<arr.length; i++) {
                A[i] = arr[i];
            }
            Arrays.sort(arr);
        
            for (int i=0 ; i<A.length ; i++) {
            if (A[i] != arr[0]) {
                answer[count] = A[i];
                count++;
                }  
            }
            return answer;
        }
    }
}