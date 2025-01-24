import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
    
            int a = sc.nextInt();
            int b = sc.nextInt();

           
            int num = a * b;

            int gcd = 0;
            if (a > b) {
                gcd = findGCD(a, b);
            } else {
                gcd = findGCD(b, a);
            }

            System.out.println(num / gcd);
        }

        sc.close();
    }

    public static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
