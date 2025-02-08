package Baekjoon.문제풀이.-2진수;

import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder res = new StringBuilder();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        while (n != 0) {
            if (n % -2 != 0) {
                res.append("1");
                n = n / -2 + 1; // -2로 나누어 떨어지지 않는 경우 몫을 구하기 위해 1을 더함
            } else {
                res.append("0");
                n /= -2;
            }
        }

        System.out.println(res.reverse()); // 결과 뒤집어서 출력
    }
}
