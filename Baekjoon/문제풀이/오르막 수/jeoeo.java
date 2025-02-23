import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MOD = 10007;
        int[] dp = new int[10];

        for (int i = 0; i < 10; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 10; j++) {
                dp[j] = (dp[j] + dp[j - 1]) % MOD;
            }
        }

        int sum = 0;
        for (int num : dp) {
            sum = (sum + num) % MOD;
        }

        System.out.println(sum);
        sc.close();
    }
}
