import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int stick = 64;
        int count = 0;

        
        if (X==64) {
            count = 1;
            System.out.println(count);
            return;
        }
        
        while (X>0) {
            if (stick > X) {
                stick /= 2;
            } else {
                X -= stick;
                count++;
            }
        }
        System.out.println(count);
    }
}