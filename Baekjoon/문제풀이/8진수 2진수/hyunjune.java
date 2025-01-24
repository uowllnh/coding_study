import java.util.Scanner;

public class hyunjune {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String oct = sc.next();

        String binary = new java.math.BigInteger(oct, 8).toString(2);

        System.out.println(binary);

        sc.close(); // Scanner 종료
    }
}
