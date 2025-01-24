package Baekjoon.문제풀이.소수 구하기;

import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            if (is_prime(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean is_prime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
