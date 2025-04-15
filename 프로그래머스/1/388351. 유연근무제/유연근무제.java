class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < timelogs.length; i++) {
            int count = 0;
            
            for (int j = 0; j < timelogs[i].length; j++) {
                if (startday == 1 && j < 5) {
                    if (timelogs[i][j] <= goalTime(schedules[i])) {
                        count++;
                    }
                }
                
                if (startday == 2 && (j < 4 || j > 5)) {
                    if (timelogs[i][j] <= goalTime(schedules[i])) {
                        count++;
                    }
                }
                
                if (startday == 3 && (j < 3 || j > 4)) {
                    if (timelogs[i][j] <= goalTime(schedules[i])) {
                        count++;
                    }
                }

                if (startday == 4 && (j < 2 || j > 3)) {
                    if (timelogs[i][j] <= goalTime(schedules[i])) {
                        count++;
                    }
                }

                if (startday == 5 && (j < 1 || j > 2)) {
                    if (timelogs[i][j] <= goalTime(schedules[i])) {
                        count++;
                    }
                }

                if (startday == 6 && (j > 1)) {
                    if (timelogs[i][j] <= goalTime(schedules[i])) {
                        count++;
                    }
                }

                if (startday == 7 && (j > 0 && j < 6)) {
                    if (timelogs[i][j] <= goalTime(schedules[i])) {
                        count++;
                    }
                }
            }
            
            if (count == 5) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public int goalTime(int schedules) {
        schedules += 10;
        
        int hour = schedules / 100;
        int minutes = schedules % 100;
        
        if (minutes >= 60) {
            hour += 1;
            minutes -= 60;
        }
        
        return hour * 100 + minutes;
    }
}