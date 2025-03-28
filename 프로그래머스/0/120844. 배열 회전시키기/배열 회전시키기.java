class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i-1];
            }
        }
        
        if (direction.equals("left")) {
            answer[0] = numbers[1];
            for (int i = 1; i < numbers.length; i++) {
                
                if (i < numbers.length - 1) {
                    answer[i] = numbers[i+1];
                } else {
                    answer[i] = numbers[0];
                }
                
            }
        }
        
        return answer;
    }
}