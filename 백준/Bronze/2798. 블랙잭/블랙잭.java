import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N];
        int max = 0;
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    sum = numbers[i] + numbers[j] + numbers[k];
                    if (sum > max && sum <= M) {
                        max = sum;
                    }
                }
            }
        }
        
        System.out.println(max);
    }
}