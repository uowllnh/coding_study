import java.util.Scanner;

public class hayeon {
    public static int dp(int x) {
        if (x == 1) {
            return 1;
        } else if (x == 2) {
            return 2;
        } else if (x == 3) {
            return 4;
        } else {
            return dp(x - 1) + dp(x - 2) + dp(x - 3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  
            System.out.println(dp(n));  
        }
        
        scanner.close();
    }
}
