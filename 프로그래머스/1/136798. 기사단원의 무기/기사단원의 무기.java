class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int q = 0;
            for (int j = 1; j * j <= i; j++) { // sqrt(i) 까지만 반복
                if (i % j == 0) {
                    q++;
                    if (j * j != i) { // 제곱수가 아닌 경우에만 i/j 추가
                        q++;
                    }
                }
            }

            answer += (q > limit) ? power : q;
        }
        return answer;
    }
}