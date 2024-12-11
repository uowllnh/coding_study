import java.util.Scanner;

public class jeoeo {

    // C(M,N)은 M개 중 N개를 고르는 방법의 수
    // C(M,N) = M! / {N!*(M-N)!}
    public static long combination(int M, int N) {
        if (N > M) return 0;
        
        long result = 1; //계산된 조합 값
        // M부터 M-N+1까지 곱하고, 1부터 N까지 나눔
        for (int i = 1; i <= N; i++) {
            result = result * (M - N + i) / i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); //서쪽
            int M = scanner.nextInt(); //동쪽
            
            // C(M, N)
            long result = combination(M, N);
            
            System.out.println(result);
        }
        
        scanner.close();
    }
}
