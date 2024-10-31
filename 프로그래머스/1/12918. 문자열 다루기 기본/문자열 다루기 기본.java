class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if (s.length() == 4 || s.length() ==6){
            try {
                int a = Integer.parseInt(s);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        
        
        return answer;
    }
}