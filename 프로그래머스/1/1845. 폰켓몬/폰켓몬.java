import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        if (map.size() > nums.length / 2) {
            return nums.length / 2;
        } else {
            return map.size();
        }
    }
}