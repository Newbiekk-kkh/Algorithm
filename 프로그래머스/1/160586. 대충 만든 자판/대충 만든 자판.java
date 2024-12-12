import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < targets[i].length(); j++) {
                int[] index = new int[keymap.length];
                
                for (int k = 0; k < keymap.length; k++) {
                    for (int l = 0; l < keymap[k].length(); l++) {
                        if (targets[i].charAt(j) == keymap[k].charAt(l)) {
                            index[k] = l+1;
                            break;
                        }
                    }  
                }
                // index의 값이 0 또는 값
                Arrays.sort(index);
                
                for (int m = 0; m < index.length; m++) {
                    if (index[m] != 0) {
                        sum += index[m];
                        break;
                    }
                }
                
                if (index[keymap.length-1] == 0) {
                    sum = -1;
                    break;
                }
            }
            
            answer[i] = sum;
        }
        
        return answer;
    }
}