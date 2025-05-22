import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Map<Integer, int[]> keypadMap = new HashMap<>();
        int count = 1;
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=3; j++) {
                int[] keypad = new int[2];
                keypad[0] = i;
                keypad[1] = j;
                
                keypadMap.put(count, keypad);
                count++;
            }
        }
        
        int[] zero = {4, 2};
        keypadMap.put(0, zero);
        int[] left = {4, 1};
        int[] right = {4, 3};
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                left = keypadMap.get(numbers[i]);
            }
            if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
                right = keypadMap.get(numbers[i]);
            }
            if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
                int[] number = keypadMap.get(numbers[i]);
                int leftHand = Math.abs(number[1] - left[1]) + Math.abs(number[0] - left[0]);
                int rightHand = Math.abs(number[1] - right[1]) + Math.abs(number[0] - right[0]);
                
                if (leftHand > rightHand) {
                    sb.append("R");
                    right = keypadMap.get(numbers[i]);
                } else if (rightHand > leftHand) {
                    sb.append("L");
                    left = keypadMap.get(numbers[i]);
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left = keypadMap.get(numbers[i]);
                    } else {
                        sb.append("R");
                        right = keypadMap.get(numbers[i]);
                    }
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}