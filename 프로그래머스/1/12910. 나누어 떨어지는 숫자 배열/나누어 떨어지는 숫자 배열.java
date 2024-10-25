import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int number = 0;
        
        for (int i = 0 ; i <arr.length ; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        
        if (count==0) {
            int[] arr2 = {-1};
            return arr2;
        }
        
        int[] arr2 = new int[count];
        
         for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] % divisor ==0 ) {
                arr2[number] = arr[i];
                number++;
            }
            
            
        }
        Arrays.sort(arr2);
        
        return arr2;
    }
}