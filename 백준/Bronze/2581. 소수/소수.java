import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();       
        int N = sc.nextInt();
        int sum = 0;
        int first = 0;
        
        for (int i = M; i <= N; i++) {
            int numCount = 0;
            
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numCount++;
                }
                
                if (numCount > 2) {
                    break;
                }
            }
            
            if (numCount == 2 && first == 0) {
                first = i;
            }
            
            if (numCount == 2) {
                sum += i;
            }
        }
        
        if (sum != 0) {
            System.out.println(sum + "\n" + first);
        } else {
            System.out.println("-1");            
        }
    }
}