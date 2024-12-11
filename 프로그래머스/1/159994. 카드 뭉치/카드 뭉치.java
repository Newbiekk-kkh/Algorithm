class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index = 0;
        int index2 = 0;
        
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cards1[index])) {
                if (index < cards1.length-1) {
                    index++;    
                }
            } else if (goal[i].equals(cards2[index2])) {
                if (index2 < cards2.length-1) {
                    index2++;   
                }
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}