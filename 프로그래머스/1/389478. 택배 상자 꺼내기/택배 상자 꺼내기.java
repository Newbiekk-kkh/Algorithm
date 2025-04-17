class Solution {
    public int solution(int n, int w, int num) {
        int h = (n + w - 1) / w;  // 올림 나눗셈
        int[][] box = new int[h][w];
        int number = 1;

        // 상자 쌓기
        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w && number <= n; j++) {
                    box[i][j] = number++;
                }
            } else {
                for (int j = w - 1; j >= 0 && number <= n; j--) {
                    box[i][j] = number++;
                }
            }
        }

        // num 위치 찾고, 위에 있는 상자 세기
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (box[i][j] == num) {
                    int count = 0;
                    for (int k = i; k < h; k++) {
                        if (box[k][j] != 0) count++;
                    }
                    return count;
                }
            }
        }

        return 0; // num이 없을 경우
    }
}
