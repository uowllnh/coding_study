package Baekjoon.문제풀이.진법 변환 2;

import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        StringBuilder s = new StringBuilder();
        String num = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while (n > 0) {
            s.append(num.charAt(n % b));
            n /= b;
        }

        System.out.println(s.reverse().toString());
    }
    
}
