import java.util.Scanner;

public class hyunjune {

    static final int MOD = 1_000_000_000;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.close();

        long[][] dp = new long[T+1][10];

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= T; i++) {
            for (int j = 0; j <= 9; j++) {
                // 파이썬과 다른 방식으로 풀이. 0과 9를 제외하고는 누적 방식으로 풀이
                if (j > 0) dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
                if (j < 9) dp[i][j] = (dp[i][j] + dp[i - 1][j + 1]) % MOD;
            }
        }

         // 결과 계산
         long result = 0;
         for (int j = 0; j <= 9; j++) {
             result = (result + dp[T][j]) % MOD;
         }
 
         System.out.println(result);
    }

}
