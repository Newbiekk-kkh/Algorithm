import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;

        // n의 배수 개수 세기
        for (int num : numlist) {
            if (num % n == 0) {
                count++;
            }
        }

        // 결과 배열 생성
        int[] answer = new int[count];
        int index = 0;

        // n의 배수만 배열에 저장
        for (int num : numlist) {
            if (num % n == 0) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}
