import java.util.Scanner;

public class jeoeo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int minPerimeter = Integer.MAX_VALUE;

    // a*b >= N을 만족해야 함 -> N의 약수를 통해 최소 둘레 계산
    for (int i = 1; i <= Math.sqrt(N); i++) {
      if (N % i == 0) {
        int a = i;
        int b = N/i;
        int perimeter = 2*(a + b);
        // 최소 둘레로 값 갱신, Math.min : 두 수를 비교하여 작은 값 반환
        minPerimeter = Math.min(minPerimeter, perimeter);
      }
    }
    System.out.println(minPerimeter);

  }
}
