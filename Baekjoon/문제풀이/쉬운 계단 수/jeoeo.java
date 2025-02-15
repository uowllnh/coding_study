import java.io.*;

public class jeoeo {
    static int MOD = 1000000000;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        long[][] dp = new long[N + 1][10];
        
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }
        
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][1];
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][8];
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
                }
            }
        }
        
        long result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[N][i]) % MOD;
        }
        
        System.out.println(result);
    }
}
