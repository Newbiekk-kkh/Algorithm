import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
			
		    int first = sc.nextInt();
			int second = sc.nextInt();
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {
				System.out.println("factor");
			}
			else if(first % second == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
        
    }
}