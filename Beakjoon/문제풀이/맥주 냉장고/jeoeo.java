import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int W = Integer.MAX_VALUE;
        int A = 0, B = 0, C = 0;

        // 가능한 a, b, c를 탐색
        for (int a = 1; a <= Math.cbrt(n); a++) {  // a는 1부터 n의 세제곱근까지
            if (n % a == 0) {  // a가 n을 나누어 떨어지면
                for (int b = a; b <= Math.sqrt(n / a); b++) {  // b는 a부터 시작하여 n/a의 제곱근까지
                    if ((n / a) % b == 0) {
                        int c = n / (a * b);
                        int surfaceArea = 2 * (a * b + b * c + a * c);  // 겉넓이 계산
                        if (surfaceArea < W) {  // 최소 겉넓이 갱신
                            W = surfaceArea;
                            A = a;
                            B = b;
                            C = c;
                        }
                    }
                }
            }
        }

        System.out.println(A + " " + B + " " + C);
    }
}
