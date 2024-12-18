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
        int[] a = list.get(0);
        int[] b = list.get(list.size()-1);
        int[] d = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            int[] c = list.get(i);
            d[i] = c[1];
        }
        
        Arrays.sort(d);
        
        int[] answer = {a[0], d[0], b[0]+1, d[d.length-1]+1};
        
        return answer;
    }
}