import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] chessPiece = {1, 1, 2, 2, 2, 8};
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < chessPiece.length; i++) {
            int n = sc.nextInt();
            System.out.print(chessPiece[i] - n + " ");
        }
        
        sc.close();
    }
}