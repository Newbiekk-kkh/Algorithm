import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[][] A = new int[9][9];
        
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(A[i][j] > max) {
                    max = A[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        
        System.out.println(max + "\n" + (a+1) + " " + (b+1));
    }
}
