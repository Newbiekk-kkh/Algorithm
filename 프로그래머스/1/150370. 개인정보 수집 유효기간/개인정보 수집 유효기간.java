import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        String[] todaySplit = today.split("\\.");
        int[] todaySplitInt = new int[3];
        
        for (int i = 0; i < 3; i++) {
            todaySplitInt[i] = Integer.parseInt(todaySplit[i]);
        }
        
        Map<String, Integer> termsMap = new HashMap<>();
        
        for (int i = 0; i < terms.length; i++) {
            String[] termsSplit = terms[i].split(" ");
            termsMap.put(termsSplit[0], Integer.parseInt(termsSplit[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privaciesSplit = privacies[i].split(" ");
            String[] privacy = privaciesSplit[0].split("\\.");
            if (isOkay(todaySplitInt, termsMap, privaciesSplit[1], privacy) == false) {
                answer.add(i+1);
            }
        }
        
        int[] answerArray = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            answerArray[i] = answer.get(i);
        }
        
        return answerArray;
    }
    
    public boolean isOkay(int[] todaySplitInt, Map<String, Integer> termsMap, String privaciesSplit, String[] privacy) {
        int[] privacyInt = new int[3];
        
        for (int i = 0; i < 3; i++) {
            privacyInt[i] = Integer.parseInt(privacy[i]);
        }
        
        int month = termsMap.get(privaciesSplit);
        
        privacyInt[1] += month;
        privacyInt[2] -= 1;
        
        while (privacyInt[1] > 12) {
            if (privacyInt[1] > 12) {
                privacyInt[0] += 1;
                privacyInt[1] -= 12;
            }
        
            if (privacyInt[2] < 1) {
                privacyInt[1] -= 1;
                privacyInt[2] += 28;
            
                    if (privacyInt[1] < 1) {
                    privacyInt[0] -= 1;
                    privacyInt[1] += 12;
                }
            }    
        }
        
        if (todaySplitInt[0] > privacyInt[0]) {
            return false;
        } else if (todaySplitInt[0] == privacyInt[0] && todaySplitInt[1] > privacyInt[1]) {
            return false;
        } else if (todaySplitInt[0] == privacyInt[0] && todaySplitInt[1] == privacyInt[1] && todaySplitInt[2] > privacyInt[2]) { 
            return false;
        }
        
        return true;
    }
}