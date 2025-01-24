package Baekjoon.문제풀이.최소공배수;

import java.util.Scanner;

public class hayeon {
    // 최대공약수
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    // 최소공배수
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            System.out.println(lcm(a, b));
        }
        
        scanner.close();
    }
}
