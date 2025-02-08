import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        int[] dp = new int[N + 1];
        
        for (int i = 2; i <= N; i++) {
            a[i] = a[i - 1] + 1;
            
            if (i % 2 == 0) {
                a[i] = Math.min(dp[i], a[i / 2] + 1);
            }
            
            if (i % 3 == 0) {
                a[i] = Math.min(a[i], a[i / 3] + 1);
            }
        }
        
        System.out.println(a[N]);
    }
}