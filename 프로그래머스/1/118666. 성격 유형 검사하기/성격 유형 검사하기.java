import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        int[] score = {-3, -2, -1, 0, 1, 2, 3};
        char[] c = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int[] totalScore = new int[c.length];
        
        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (survey[i].charAt(1) == c[j]) {
                    totalScore[j] += score[choices[i]-1];
                }  
            }
        }
        
        StringBuilder sb = new StringBuilder("");
        
        sb.append(totalScore[0] >= totalScore[1] ? "R" : "T");
        sb.append(totalScore[2] >= totalScore[3] ? "C" : "F");
        sb.append(totalScore[4] >= totalScore[5] ? "J" : "M");
        sb.append(totalScore[6] >= totalScore[7] ? "A" : "N");
            
        String answer = sb.toString();
        return answer;
    }
}