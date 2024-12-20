class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] quizPiece = quiz[i].split(" ");
            
            answer[i] = "X";
            
            if (quizPiece[1].equals("+")) {
                int quizAnswer = Integer.parseInt(quizPiece[0]) + Integer.parseInt(quizPiece[2]);
                if (quizAnswer == Integer.parseInt(quizPiece[4])) {
                    answer[i] = "O";
                }
            }
            
            if (quizPiece[1].equals("-")) {
                int quizAnswer = Integer.parseInt(quizPiece[0]) - Integer.parseInt(quizPiece[2]);
                if (quizAnswer == Integer.parseInt(quizPiece[4])) {
                    answer[i] = "O";
                }
            }
        }
        
        return answer;
    }
}