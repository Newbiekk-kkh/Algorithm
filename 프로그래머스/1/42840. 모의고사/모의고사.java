class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;
                
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i%5]) {
                scoreA++;
            }
            if (answers[i] == b[i%8]) {
                scoreB++;
            }
            if (answers[i] == c[i%10]) {
                scoreC++;
            }
        }
        
        if (scoreA == scoreB && scoreB == scoreC) {
            return new int[]{1,2,3};
        }
        
        if (scoreA > scoreC && scoreA == scoreB) {
            return new int[]{1,2};
        }
        
        if (scoreC > scoreB && scoreA == scoreC) {
            return new int[]{1,3};
        }
        
        if (scoreB > scoreA && scoreB == scoreC) {
            return new int[]{2,3};
        }
        
        if (scoreA > scoreB && scoreA > scoreC) {
            return new int[]{1};
        }
        
        if (scoreB > scoreA && scoreB > scoreC) {
            return new int[]{2};
        }
        
        return new int[]{3};
    }
}