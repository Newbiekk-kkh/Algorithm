class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        
        for (int i = 0; i < n; i++) {
            student[i] = 1;
        }
        
        for (int i = 0; i < lost.length; i++) {
            student[lost[i]-1] -= 1;
        }
        
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i]-1] += 1;
        }
        
        if(student[0] == 0 && student[1] == 2) {
            student[0] += 1;
            student[1] -= 1;
        }
        
        if(student[n-1] == 0 && student[n-2] == 2) {
            student[n-1] += 1;
            student[n-2] -= 1;
        }
        
        for (int i = 1; i < n-1; i++) {
            if (student[i] == 0 && student[i-1] == 2) {
                student[i] += 1;
                student[i-1] -= 1;
            }
            if (student[i] == 0 && student[i+1] == 2) {
                student[i] += 1;
                student[i+1] -= 1;
            }
        }
        
        int count = 0;
        
        for (int i : student) {
            if (i > 0) {
                count++;
            }
        }
        
        return count;
    }
}