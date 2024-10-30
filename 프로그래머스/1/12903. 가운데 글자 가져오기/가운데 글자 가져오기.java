class Solution {
    public String solution(String s) {
        String answer = "";
        String S[] = s.split("");
        if (S.length%2==1) {
            answer = s.substring(S.length/2,S.length/2+1);
        } else {
            answer = s.substring((S.length/2)-1 , S.length/2+1);
        }

        return answer;
    }
}