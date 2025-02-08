import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            dp[i] = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], dp[j] + dp[i - j]);
            }
        }
        
        int maxVal = 0;
        for (int i = 1; i <= n; i++) {
            maxVal = Math.max(maxVal, dp[i]);
        }
        
        System.out.println(maxVal);
        scanner.close();
    }
}