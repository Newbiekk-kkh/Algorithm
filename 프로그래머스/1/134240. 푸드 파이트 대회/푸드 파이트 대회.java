import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        int cal = 1;
        
        for (int i = 1; i<food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                list.add(cal);
            }
            cal++;
        }
        
        list.add(0);
        cal -= 1;
        
        for (int i = food.length-1; i > 0; i--) {
            for (int j = 0; j < food[i]/2; j++) {
                list.add(cal);
            }
            cal--;
        }
        
        String[] str = new String[list.size()];
        
        for (int i = 0; i<list.size(); i++) {
            str[i] = Integer.toString(list.get(i));
        }
        
        answer = String.join("",str);
        
        return answer;
    }
}