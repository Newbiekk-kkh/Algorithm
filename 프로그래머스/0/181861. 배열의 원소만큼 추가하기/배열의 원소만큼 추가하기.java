class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        
        for (int n : arr) {
            sum += n;
        }
        
        int[] answer = new int[sum];
        int sum2 = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            
            for (int j = sum2; j < sum2 + a; j++) {
                answer[j] = a;
            }
            sum2 += a;
        }
        
        
        return answer;
    }
}