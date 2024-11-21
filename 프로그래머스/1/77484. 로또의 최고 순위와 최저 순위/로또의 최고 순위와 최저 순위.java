class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int cnt = 0;
        
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }
        
        String[] str = new String[lottos.length];
        
        for (int i = 0; i < lottos.length; i++) {
            str[i] = "" + lottos[i];
        }
        
        for (int i = 0; i < lottos.length; i++) {
            if (str[i].equals("0")) {
                cnt++;
            }
        }
        
        answer[0] = viewRanking(count + cnt);
        answer[1] = viewRanking(count);
        
        return answer;
    }
    
    public static int viewRanking(int count) {
        switch (count) {
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return 6;
        }
    }
}