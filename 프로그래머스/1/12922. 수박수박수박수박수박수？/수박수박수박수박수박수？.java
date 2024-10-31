class Solution {
    public String solution(int n) {
        String answer = "";
        String[] str = new String[n];
        
        str[0] = "수";
        
        for (int i = 1; i<n ; i++) {
            if(i%2 ==1) {
                str[i] = "박";
            } else {
                str[i] = "수";
            }
        }
        
        answer = String.join("",str);
        
        return answer;
    }
}