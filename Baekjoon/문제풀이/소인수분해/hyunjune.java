import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        for (int factor = 2; factor * factor <= n; factor++) {
            while (n % factor == 0) {
                System.out.println(factor);
                n /= factor;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }
}
