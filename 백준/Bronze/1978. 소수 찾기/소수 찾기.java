import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int numCount = 0;
            
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    numCount++;
                }
                
                if (numCount > 2) {
                    break;
                }
            }
            
            if (numCount == 2) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}