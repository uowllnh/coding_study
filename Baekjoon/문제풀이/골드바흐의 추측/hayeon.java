package Baekjoon.문제풀이.골드바흐의 추측;

import java.util.Scanner;



public class hayeon {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] goldbach(int n) {
        int a = n / 2 - 1;
        int b = n / 2 + 1;

        while (a > 1) {
            if (isPrime(a) && isPrime(b)) {
                return new int[] {a, b}; 
            }
            a -= 2;
            b += 2;
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); 
            int[] result = goldbach(n);

            if (result != null) {
                System.out.println(n + " = " + result[0] + " + " + result[1]);
            } else {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }

        sc.close();
    }

}
