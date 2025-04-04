class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        if (h > 0 && board[h][w].equals(board[h-1][w])) {
            answer++;
        }
        
        if (h+1 < board.length && board[h][w].equals(board[h+1][w])) {
            answer++;
        }
        
        if (w > 0 && board[h][w].equals(board[h][w-1])) {
            answer++;
        }
        
        if (w+1 < board.length && board[h][w].equals(board[h][w+1])) {
            answer++;
        }
        
        return answer;
    }
}