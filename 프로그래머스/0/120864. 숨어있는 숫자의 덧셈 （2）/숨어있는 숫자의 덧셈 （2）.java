class Solution {
    public int solution(String my_string) {
        String replaced = my_string.replaceAll("[^0-9]", " ");
        
        String[] numbers = replaced.split(" ");

        int answer = 0;
        for (String num : numbers) {
            if (!num.equals("")) {
                answer += Integer.parseInt(num);
            }
        }

        return answer;
    }
}