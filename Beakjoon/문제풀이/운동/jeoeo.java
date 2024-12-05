package coding_study.Beakjoon.문제풀이.운동;

import java.util.Scanner;

public class jeoeo {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
      int N = sc.nextInt(); // 운동시간
      int m = sc.nextInt(); // 최소(초기)
      int M = sc.nextInt(); // 최대
      int T = sc.nextInt(); // 증가
      int R = sc.nextInt(); // 감소
  
      sc.close();
  
    // 운동을 시작할 수 없으면 -1
    if (m+T > M) {
      System.out.println(-1);
      return;
    }

    int pulse = m; // 맥박
    int Ntime = 0; // 운동횟수
    int result = 0;

    while (Ntime < N) {
      if (pulse+T <= M) {
        pulse += T;
        Ntime++;
      } else {
        pulse -= R;
        if (pulse < m) {
          pulse = m;
        }
      }
      result++;
    }

    System.out.println(result);

  }
}