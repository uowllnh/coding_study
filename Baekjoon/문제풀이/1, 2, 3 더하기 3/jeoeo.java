import java.util.Scanner;

public class jeoeo {
    static final int MOD = 1000000009;
    static int[] arr = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= 1000000; i++) {
            arr[i] = ((arr[i - 1] % MOD) + (arr[i - 2] % MOD) + (arr[i - 3] % MOD)) % MOD;
        }

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            System.out.println(arr[a] % MOD);
        }

        sc.close();
    }
}
