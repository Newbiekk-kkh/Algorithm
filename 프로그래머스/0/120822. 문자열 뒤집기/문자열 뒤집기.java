class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);

        String answer = sb.reverse().toString();
        
        return answer;
    }
}