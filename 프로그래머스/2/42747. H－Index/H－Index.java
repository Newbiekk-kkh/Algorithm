import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations); // 논문 인용 횟수를 오름차순으로 정렬

        for (int i = 0; i < citations.length; i++) {
            int count = 0;

            // 현재 논문 이상의 인용 횟수를 가진 논문 개수 계산
            for (int j = i; j < citations.length; j++) {
                if (citations[j] >= citations[i]) {
                    count++;
                }
            }

            // H-Index 조건 확인: 인용 횟수와 남은 논문 수 중 최솟값
            int h = Math.min(citations[i], count);
            answer = Math.max(answer, h); // 최대값으로 갱신
        }

        return answer;
    }
}