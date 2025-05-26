class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        int[] first = new int[n];
        int[] second = new int[num_list.length - n];
        
        for (int i = 0; i < n; i++) {
            first[i] = num_list[i];
        }
        
        int cnt = 0;
        
        for (int i = n; i < num_list.length; i++) {
            second[cnt] = num_list[i];
            cnt++;
        }
        
        int count = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i < num_list.length - n) {
                answer[i] = second[i];
            } else {
                answer[i] = first[count];
                count++;
            }
            
        }
        
        return answer;
    }
}