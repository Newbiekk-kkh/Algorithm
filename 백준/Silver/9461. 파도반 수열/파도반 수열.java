import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] N = new int[T];
        
        for (int i = 0; i < T; i++) {
            N[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N.length; i++) {
            if (N[i] <= 3) {
                System.out.println("1");
            }
                
            if (N[i] > 3) {
                long[] P = new long[N[i]+1];
                
                P[1] = 1;
                P[2] = 1;
                P[3] = 1;
                
                for (int j = 4; j <= N[i]; j++) {
                    P[j] = P[j-2] + P[j-3];
                }
                
                System.out.println(P[N[i]]);
           }    
        }
    }
}
