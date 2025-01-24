import java.math.BigInteger;
import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] locs = new int[n];
        for (int i = 0; i < n; i++) {
            locs[i] = sc.nextInt();
        }

        BigInteger result = BigInteger.valueOf(Math.abs(s - locs[0]));

        for (int i = 1; i < n; i++) {
            BigInteger diff = BigInteger.valueOf(Math.abs(s - locs[i]));
            result = result.gcd(diff); 
        }
        System.out.println(result);
    }
}
