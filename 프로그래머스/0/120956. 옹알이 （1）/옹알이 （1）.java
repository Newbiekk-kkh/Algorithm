class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if (babbling[i].contains(words[j])) {
                    babbling[i] = babbling[i].replace(words[j], "1");
                    count++;
                }
            }
            
            if (babbling[i].length() == count) {
                answer++;
            }
        }
        
        return answer;
    }
}