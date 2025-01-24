import java.util.Scanner;

public class baek2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long count2 = countFactors(n, 2) - countFactors(m, 2) - countFactors(n - m, 2);
        long count5 = countFactors(n, 5) - countFactors(m, 5) - countFactors(n - m, 5);

        System.out.println(Math.min(count2, count5));
        
        sc.close(); 
    }

    public static long countFactors(int n, int factor) {
        long count = 0;
        while (n >= factor) {
            count += n / factor;
            n /= factor;
        }
        return count;
    }
}
