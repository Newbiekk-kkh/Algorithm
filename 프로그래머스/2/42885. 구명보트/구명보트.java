import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int left = 0;
        int right = people.length - 1;
        int boat = 0;
        
        Arrays.sort(people);
        
        while (right > left) {
            if (limit >= people[left] + people[right]) {
                right--;
                left++;
                boat++;
            } else {
                right--;
                boat++;
            }
        }
        
        if (right == left) {
            boat++;
        }
        
        return boat;
    }
}