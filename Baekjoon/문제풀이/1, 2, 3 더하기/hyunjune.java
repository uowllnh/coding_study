import java.io.*;

public class hyunjune {
    static final int num = 1000000009;
    static int[][] dp = new int[100001][4];

    public static void onetwothree() {

        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;

        for (int i = 4; i <= 100000; i++) {
            dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % num;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % num;
            dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % num;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        onetwothree();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int t = Integer.parseInt(br.readLine());
            int result = (dp[t][1] + dp[t][2] + dp[t][3]) % num;
            sb.append(result).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}