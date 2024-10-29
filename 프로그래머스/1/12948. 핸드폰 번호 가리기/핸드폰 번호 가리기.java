import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String[] A = phone_number.split("");
        
        
        for (int i = 0 ; i < (A.length-4) ; i++) {
            A[i] = "*";
        }
        
        phone_number = String.join("",A);
        return phone_number;
    }
}