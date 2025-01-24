import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] lst = new int[T];
        int max = 0;

        for (int i = 0; i < T; i++) {
            lst[i] = sc.nextInt();
            if (lst[i] > max) {
                max = lst[i];
            }
        }
        boolean[] decimalList = findDecimal(max);

        int count = 0;
        for (int num : lst) {
            if (decimalList[num]) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }

    public static boolean[] findDecimal(int n) {
        boolean[] isPrime = new boolean[n + 1];

    
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}
