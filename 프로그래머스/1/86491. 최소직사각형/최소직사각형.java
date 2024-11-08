class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxGaro = 0;
        int maxSero = 0;
        
        for (int i= 0; i<sizes.length; i++) {
            if (sizes[i][1] > sizes[i][0]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        for (int i = 0; i<sizes.length ; i++) {
            if (sizes[i][0] >= maxGaro) {
                maxGaro = sizes[i][0];
            }
            
            if (sizes[i][1] >= maxSero) {
                maxSero = sizes[i][1];
            }
        }
        
        answer = maxGaro * maxSero;
        
        return answer;
    }
}