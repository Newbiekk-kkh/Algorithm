import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        String[] s = str.split("");
        
        Arrays.sort(s, Comparator.reverseOrder());
        str = String.join("",s);
        n = Long.parseLong(str);
        
        return n;
        }
}