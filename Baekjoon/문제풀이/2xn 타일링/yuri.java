import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        // dp 배열을 위해 입력 값보다 2 큰 크기를 잡습니다(아마추어스럽게).
        int[] arr = new int[input + 2];
        
        // 기저값 설정
        arr[1] = 1;  // n=1
        if (input > 1) {
            arr[2] = 2;  // n=2
        }
        
        // 점화식: dp[n] = dp[n-1] + dp[n-2]
        for (int i = 3; i <= input; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            arr[i] = arr[i] % 10007;  // 매번 나머지 연산
        }
        
        // 결과 출력
        System.out.println(arr[input] % 10007);
        sc.close();
    }
}
