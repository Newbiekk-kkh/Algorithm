class Solution {
    public int solution(String[] s1, String[] s2) {
        int count = 0;
        for (int i = 0; i < Math.max(s1.length, s2.length); i++) {
            for (int j = 0; j < Math.min(s1.length, s2.length); j++) {
                if(s1.length >= s2.length && s1[i].equals(s2[j])) {
                    count++;
                }
                if(s2.length > s1.length && s2[i].equals(s1[j])) {
                    count++;
                }
            }
        }
        return count;
    }
}