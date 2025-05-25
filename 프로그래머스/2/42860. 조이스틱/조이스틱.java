class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        
        for (int i = 0; i < len; i++) {
            int count = 0;
            
            if (name.charAt(i) <= 'N') {
                count = name.charAt(i) - 'A';
            } else {
                count = 26 - (name.charAt(i) - 'A');
            }
            
            answer += count;
        }
        
        int minMove = len - 1;

        for (int i = 0; i < len; i++) {
            int next = i + 1;

            while (next < len && name.charAt(next) == 'A') {
                next++;
            }

            int move = i + len - next + Math.min(i, len - next);
            minMove = Math.min(minMove, move);
        }

        return answer + minMove;
    }
}

// A || B C D E F G H I J K  L  M || N || O  P  Q  R S T U V W X Y Z
// 0 || 1 2 3 4 5 6 7 8 9 10 11 12 | 13 | 12 11 10 9 8 7 6 5 4 3 2 1