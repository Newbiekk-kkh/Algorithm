import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        int a = 1;
        
        for(int i = 0 ; i < seoul.length ; i++) {
            if (seoul[i].equals("Kim")) {
            System.out.println("김서방은 " + i + "에 있다" );
            a = i;
            break;
            }        
        }
        
        return ("김서방은 " + a + "에 있다");
    }
}