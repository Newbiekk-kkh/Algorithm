import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int[] countList = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            countList[i] = count;
        }
        
        int maxCount = 0; // 최대 등장 횟수
        for (int i = 0; i < countList.length; i++) {
            if (countList[i] > maxCount) {
                maxCount = countList[i];
                answer = array[i];
            }
        }

        Arrays.sort(countList);
        if (countList.length > 3&&countList[countList.length-1] == countList[countList.length-2]) {
            return -1;
        }
        
        return answer;
    }
}