import java.util.*;

class Solution {
    public long solution(long n) {
        List<Long> list = new ArrayList<Long>();
        
        while(n>0) {
                long tempNum = n % 10;
                list.add(tempNum);
                n /= 10;
            }
        Collections.sort(list);
        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
        for (Long digit : list) {
            sb.append(digit.toString()); // Long을 String으로 변환하여 추가
        }

        return Long.parseLong(sb.toString());
        }
}