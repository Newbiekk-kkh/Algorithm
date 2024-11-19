import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> hallOfFame = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);
            Collections.sort(hallOfFame, Collections.reverseOrder());
            
            answer[i] = hallOfFame.get(Math.min(i, k - 1)); // k보다 작으면 i번째, k보다 크면 k-1번째
        }

        return answer;
    }
}