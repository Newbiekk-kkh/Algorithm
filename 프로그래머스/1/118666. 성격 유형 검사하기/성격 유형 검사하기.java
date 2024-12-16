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
        
        sb = totalScore[0] >= totalScore[1] ? sb.append("R") : sb.append("T");
        sb = totalScore[2] >= totalScore[3] ? sb.append("C") : sb.append("F");
        sb = totalScore[4] >= totalScore[5] ? sb.append("J") : sb.append("M");
        sb = totalScore[6] >= totalScore[7] ? sb.append("A") : sb.append("N");
            
        String answer = sb.toString();
        return answer;
    }
}