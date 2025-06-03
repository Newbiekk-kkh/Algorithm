class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] split = binomial.split(" ");
        
        if (split[1].equals("+")) {
            answer = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
        } else if (split[1].equals("-")) {
            answer = Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
        } else {
            answer = Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
        }

        return answer;
    }
}