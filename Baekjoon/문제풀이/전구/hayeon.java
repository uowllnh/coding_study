package coding_study.Beakjoon.문제풀이.전구;

//전구

// 1 : 전구가 켜져있는 상태 
// 0 : 전구가 꺼져있는 상태

// 1번 명령어 [i x] : i번째 전구의 상태를 x로 변경
// 2번 명령어 [l r] : l번째부터 r번째까지의 전구 상태 변경(킴->끔, 끔->킴)
// 3번 명령어 [l r] : l번째부터 r번째까지의 전구 끔
// 4번 명령어 [l r] : l번째부터 r번째까지의 전구 킴

// 1. 전구개수 N , 명령어의 개수 M 
// 2. N의 현재 상태 S
// 3. M+2번째 줄까지 (a,b,c) a: 명령어 , [b c]: a=1일 경우 [i x] / a=2,3,4 일 경우 [l r]

import java.util.Scanner;

public class hayeon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n과 m 입력: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print("s 상태 입력: ");
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        for (int k = 0; k < m; k++) {
            System.out.print("a, b, c 입력: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 1) {
                s[b - 1] = c;
            } else if (a == 2) {
                for (int i = b - 1; i < c; i++) {
                    s[i] = (s[i] == 1) ? 0 : 1;
                }
            } else if (a == 3) {
                for (int i = b - 1; i < c; i++) {
                    s[i] = 0;
                }
            } else if (a == 4) {
                for (int i = b - 1; i < c; i++) {
                    s[i] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

