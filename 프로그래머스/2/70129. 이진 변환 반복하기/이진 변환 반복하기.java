class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    zeroCount++;
                }
            }
            s = s.replace("0", "");
            s = Integer.toString(s.length(), 2);
            count++;
        }
        
        answer[0] = count;
        answer[1] = zeroCount;
        
        return answer;
    }
}