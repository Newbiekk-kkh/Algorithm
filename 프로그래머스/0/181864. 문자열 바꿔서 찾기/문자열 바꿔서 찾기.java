class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String[] arr = myString.split("");
        String ms = "";
        
        for (String a : arr) {
            if (a.equals("A")) {
                a = "B";
                ms += a;
            } else {
                a = "A";
                ms += a;
            }
        }
        
        if (ms.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}