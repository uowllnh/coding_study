package Baekjoon.문제풀이.연속합;

import java.util.Scanner;

public class jeoeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            m[i] = Math.max(m[i], m[i] + m[i - 1]);
        }

        int max = m[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, m[i]);
        }

        System.out.println(max);
        sc.close();
    }
}
