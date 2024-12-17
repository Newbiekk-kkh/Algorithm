import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++) {
            int currentRank = map.get(callings[i]);
            
            if (currentRank > 0) {
                String temp = players[currentRank-1];
                players[currentRank-1] = players[currentRank];
                players[currentRank] = temp;
                
                            
                map.put(players[currentRank], currentRank);
                map.put(players[currentRank-1], currentRank-1);
            }
        }
        
        return players;
    }
}