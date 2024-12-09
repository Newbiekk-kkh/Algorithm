class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 1; i < k; i++) {
            sb.append(my_string);
        }
        String answer = sb.toString();
        return answer;
    }
}