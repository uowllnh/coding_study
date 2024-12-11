//틀린 문제
import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int I = scanner.nextInt();
        int J = scanner.nextInt();
        int K = scanner.nextInt();

        // Math.min()은 두 개의 인자만 받을 수 있으므로 중첩으로 사용
        int max = Math.min(Math.min(A / I, B / J), C / K);

        int orange = A - max * I;
        int apple = B - max * J;
        int pineapple = C - max * K;

        System.out.println(orange + " " + apple + " " + pineapple);

        scanner.close();
    }
}
