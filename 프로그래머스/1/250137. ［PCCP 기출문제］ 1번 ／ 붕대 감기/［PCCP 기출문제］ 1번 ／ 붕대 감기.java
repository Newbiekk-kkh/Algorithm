class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int currentHealth = health;
        
        for (int i = 0; i < attacks.length; i++) {
            if (i >= 1) {
                currentHealth += bandage[1] * (attacks[i][0] - attacks[i-1][0] - 1);
                
                if ((attacks[i][0] - attacks[i-1][0] - 1) / bandage[0] > 0) {
                    currentHealth += bandage[2] * ((attacks[i][0] - attacks[i-1][0] - 1) / bandage[0]);
                }
                
                if (currentHealth > health) {
                    currentHealth = health;
                }
            }
            
            currentHealth -= attacks[i][1];
            
            answer = currentHealth;
            
            if (currentHealth <= 0) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}