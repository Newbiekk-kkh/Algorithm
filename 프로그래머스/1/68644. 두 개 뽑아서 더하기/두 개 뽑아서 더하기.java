import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> s = new HashSet<>();
        
        for (int i = 0; i<numbers.length ; i++) {
            for (int j = 0; j<numbers.length ; j++) {
                if (i<j) {
                    int sum = numbers[i] + numbers[j];
                    s.add(sum);
                }
            }
        }
        
        int[] answer = new int[s.size()];
        List<Integer> list = new ArrayList<>(s);
        
        for (int i = 0; i<list.size() ; i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}