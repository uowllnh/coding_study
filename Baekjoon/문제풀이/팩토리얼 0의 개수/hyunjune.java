import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        String factorialResult = getFactorial(T);

        int ans = 0;
        for (int i = factorialResult.length() - 1; i >= 0; i--) {
            if (factorialResult.charAt(i) == '0') {
                ans++;
            } else {
                break;
            }
        }

        System.out.println(ans);

        sc.close(); 
    }

    public static String getFactorial(int n) {
        java.math.BigInteger answer = java.math.BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            answer = answer.multiply(java.math.BigInteger.valueOf(i));
        }
        return answer.toString();
    }
}
