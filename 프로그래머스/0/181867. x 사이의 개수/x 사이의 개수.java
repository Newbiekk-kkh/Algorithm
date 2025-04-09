class Solution {
    public int[] solution(String myString) {
        
        String[] str = myString.split("x");
        
        if (myString.charAt(myString.length() - 1) != 'x') {
            int[] answer = new int[str.length];
        
            int idx = 0;
        
            for (String s : str) {
              answer[idx++] = s.length();
            }
                    return answer;
        } else {
            int[] answer = new int[str.length + 1];
        
            int idx = 0;
        
            for (String s : str) {
              answer[idx++] = s.length();
            }
            
            answer[idx++] = 0;
                    return answer;
        }
    }
}