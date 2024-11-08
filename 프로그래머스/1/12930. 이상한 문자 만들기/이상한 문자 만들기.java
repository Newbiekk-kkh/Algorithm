class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");
        int index = 0;
        
        for (int i = 0 ; i < a.length; i++) {
            if (a[i].equals(" ")) {
                index = 0;
            } else if (index%2 !=0) {
                a[i] = a[i].toLowerCase();
                index++;
            } else if (index%2 ==0) {
                a[i] = a[i].toUpperCase();
                index++;
            }
            
            answer += a[i];
        }
        

        
        return answer;
    }
}