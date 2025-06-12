class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String stringK = "" + k;
            
        
        for (int a = i; a <= j; a++) {
            String stringA = "" + a;
            
            for (int z = 0; z < stringA.length(); z++) {
                if (stringA.charAt(z) == stringK.charAt(0)) {
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}