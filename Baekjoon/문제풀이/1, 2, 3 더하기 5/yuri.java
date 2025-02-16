import java.util.*;

public class yuri {
    static final int MOD = 1000000009;
    static int[][] dp = new int[100001][4];

    static void precompute() {
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = dp[3][2] = dp[3][3] = 1;
        for (int i = 4; i <= 100000; i++) {
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % MOD;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % MOD;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % MOD;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        precompute();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println((dp[n][1] + dp[n][2] + dp[n][3]) % MOD);
        }
    }
}
