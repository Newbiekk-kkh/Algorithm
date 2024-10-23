import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split(""); // 숫자를 문자열 배열로 변환

        Arrays.sort(arr, Comparator.reverseOrder()); // 내림차순 정렬

        String str = String.join("", arr); // 문자열 배열을 하나의 문자열로 합치기
        long answer = Long.parseLong(str); // 문자열을 long 타입으로 변환

        return answer;
    }
}