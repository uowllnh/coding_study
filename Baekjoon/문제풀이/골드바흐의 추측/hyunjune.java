import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] isPrime = findDecimal(1000000);

        while (true) {
            int T = sc.nextInt();

            if (T == 0) {
                break; 
            }

            boolean found = false;
            for (int i = 3; i <= T / 2; i += 2) {
                if (isPrime[i] && isPrime[T - i]) {
                    System.out.println(T + " = " + i + " + " + (T - i));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }

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
