import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] paper = new int[count][2];
        
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 2; j++) {
                paper[i][j] = sc.nextInt();
            }
        }
        
        int[][] art = new int[100][100];
        
        for (int i = 0; i < count; i++) {
            for (int j = paper[i][0]; j < paper[i][0] + 10; j++) {
                for (int k = paper[i][1]; k < paper[i][1] + 10; k++) {
                    art[j][k] = 1;
                }
            }
        }
        
        int answer = 0;
        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(art[i][j] == 1) {
                    answer++;
                }
            }
        }
        
        System.out.println(answer);
    }
}