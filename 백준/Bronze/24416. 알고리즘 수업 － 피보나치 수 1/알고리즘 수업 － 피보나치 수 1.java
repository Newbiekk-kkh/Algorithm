import java.util.*;

public class Main {

    static int code1 = 0; // fib()의 코드1 실행 횟수 (재귀)
    
    // 재귀 호출
    static int fib(int n) {
        if (n == 1 || n == 2) {
            code1++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // DP 방식
    static int fibonacci(int n) {
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;

        int code2 = 0;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            code2++;
        }

        return code2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fib(n);
        int code2 = fibonacci(n);

        System.out.println(code1 + " " + code2);
    }
}
