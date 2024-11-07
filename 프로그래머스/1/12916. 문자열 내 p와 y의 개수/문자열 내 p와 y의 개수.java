class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] str = s.split("");
        int count = 0;
        int count2 = 0;
        
        for (int i = 0; i<str.length ; i++) {
            if (str[i].equals("p") || str[i].equals("P")) {
                count++;
            }
            if (str[i].equals("y") || str[i].equals("Y")) {
                count2++;
            }
        }
        
        if (count == count2) {
            answer = true;
        } else {
            answer = false;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}