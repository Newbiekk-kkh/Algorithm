import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] people = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }
        
        int[] rank = new int[N];
        
        for (int i = 0; i < N; i++) {
            int count = 0;
 
            for (int j = 0; j < N; j++) {
                if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    count++;
                }
            }
            
            rank[i] = count + 1;
        }
        
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                System.out.print(rank[i]);                
            } else {
                System.out.print(" " + rank[i]);                
            }

        }
    }
}