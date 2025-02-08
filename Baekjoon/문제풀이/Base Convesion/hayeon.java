package Baekjoon.문제풀이.Base Conversion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int[] a_digits = new int[m];
        for (int i = 0; i < m; i++) {
            a_digits[i] = sc.nextInt();
        }

        // A진법 -> 10진법 변환
        int value = 0;
        for (int digit : a_digits) {
            value = value * a + digit;
        }

        // 10진법 -> B진법 변환
        ArrayList<Integer> b_digits = new ArrayList<>();
        while (value > 0) {
            b_digits.add(value % b);
            value /= b;
        }

        // 변환된 B진법 숫자는 역순이므로 뒤집어서 출력
        Collections.reverse(b_digits);
        for (int num : b_digits) {
            System.out.print(num + " ");
        }
    }
}
