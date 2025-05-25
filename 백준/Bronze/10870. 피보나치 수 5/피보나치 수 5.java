import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(fi(n));
    }
    
    static int fi(int n) {
        if (n > 2) {
            return fi(n-1) + fi(n-2);    
        } else if (n > 0) {
            return 1;
        } else {
            return 0;
        }
        
    }
}