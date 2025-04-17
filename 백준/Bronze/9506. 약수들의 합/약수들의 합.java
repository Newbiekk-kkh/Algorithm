import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int n = sc.nextInt();
            int sum = 0;
            
            if (n == -1) {
                break;
            }
            
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            
            if (sum == n) {
                System.out.print(n + " = 1");
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        System.out.print(" + " + i);
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}