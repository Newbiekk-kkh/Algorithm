import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack stack = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("(");
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        
        if (!stack.isEmpty()) {
            return false;
        }

        return answer;
    }
}