import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
                
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
            
            if (count == K) {
                System.out.println(i);
                break;
            }
        }
        
        if (K > count) {
            System.out.println("0");            
        }
    }
}