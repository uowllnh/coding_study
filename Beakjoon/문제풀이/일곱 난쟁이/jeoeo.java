package coding_study.Beakjoon.문제풀이.전구;

import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] bulbs = new int[N];

        for (int i = 0; i < N; i++) {
            bulbs[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 1) {
                // b번째 전구를 c로 변경
                bulbs[b - 1] = c;
            } else if (a == 2) {
                // b번째부터 c번째까지 상태 변경
                for (int j = b - 1; j < c; j++) {
                    bulbs[j] = 1 - bulbs[j];
                }
            } else if (a == 3) {
                // b번째부터 c번째까지 끄기
                for (int j = b - 1; j < c; j++) {
                    bulbs[j] = 0;
                }
            } else if (a == 4) {
                // b번째부터 c번째까지 켜기
                for (int j = b - 1; j < c; j++) {
                    bulbs[j] = 1;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(bulbs[i] + " ");
        }

        sc.close();
    }
}

