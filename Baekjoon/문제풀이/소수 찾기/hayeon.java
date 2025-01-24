package Baekjoon.문제풀이.소수찾기;

import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int cnt = 0;
        for (int num : nums) {
            if (is_prime(num)) {
                cnt++;
            }
        }

        System.out.println(cnt);
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
