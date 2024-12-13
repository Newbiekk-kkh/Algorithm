import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        // 배열을 List로 복사
        for (int i : ingredient) {
            list.add(i);
        }

        int i = 0;
        while (i <= list.size() - 4) {
            // "1231" 패턴 탐지
            if (list.get(i) == 1 && 
                list.get(i + 1) == 2 && 
                list.get(i + 2) == 3 && 
                list.get(i + 3) == 1) {
                
                // 패턴 제거
                list.subList(i, i + 4).clear();
                count++;
                
                // 패턴 제거 후 다시 바로 앞에서 탐색 시작
                i = Math.max(0, i - 3);
            } else {
                i++; // 다음 위치로 이동
            }
        }

        return count;
    }
}