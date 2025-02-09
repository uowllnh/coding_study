import java.util.Scanner;

public class yuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n + 2];
        
        arr[1] = 1; // n=1
        if (n > 1) {
            arr[2] = 3; // n=2
        }
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i-1] + 2 * arr[i-2]) % 10007;
        }
        
        System.out.println(arr[n] % 10007);
        
        sc.close();
    }
}
