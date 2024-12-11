import java.util.Scanner;

public class jeoeo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int t = 0; t < T; t++) {
      int k = sc.nextInt();
      int n = sc.nextInt();

      // k층 n호를 포함해야 하므로 +1해서 배열 초기화
      int[][] people = new int[k+1][n+1];
    
      // 0층 초기화
      for (int i = 1; i <= n; i++) {
        people[0][i] = i;
      }

      // 1층부터 각 층과 호수의 거주민 수 계산
      for (int i = 1; i <= k; i++) {
        for (int j = 1; j <= n; j++) {
          // 아래층 j호까지의 합과 같은 층의 j-1호까지의 합 더하기
          people[i][j] = people[i-1][j] + people[i][j-1];
        }
      }
      System.out.println(people[k][n]);
    }
    sc.close();
  }
}
