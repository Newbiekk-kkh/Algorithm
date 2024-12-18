import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        List<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    int[] coordinate = {i, j};
                    list.add(coordinate);
                }
            }
        }
        
        int lux = list.get(0)[0];
        int rdx = list.get(list.size()-1)[0] + 1;
        
        int[] luyRdy = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            int[] d = list.get(i);
            luyRdy[i] = d[1];
        }
        
        Arrays.sort(luyRdy);
        
        int luy = luyRdy[0];
        int rdy = luyRdy[luyRdy.length-1] + 1;
        
        int[] answer = {lux, luy, rdx, rdy};
        
        return answer;
    }
}