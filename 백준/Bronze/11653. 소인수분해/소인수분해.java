import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        while (N > 1) {            
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    System.out.println(i);
                    N /= i;
                    break;
                }
            }
        }
    }
}