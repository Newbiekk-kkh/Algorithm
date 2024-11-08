class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] tstr = t.split("");
        String[] pstr = p.split("");
                
        for (int i = 0; i <= tstr.length-pstr.length; i++) {
            String temp = "";
            for (int j=0; j<pstr.length; j++) {
                temp += tstr[i+j];
            }
            Long a = Long.parseLong(temp);
            Long b = Long.parseLong(p);
            
            if(a <= b) {
                answer++;
            }
        }
        
        return answer;
    }
}