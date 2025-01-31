package Baekjoon.문제풀이.소인수분해;

import java.util.Scanner;

public class hayeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.close();

        int a = 2;

        while (n != 1) {  
            if (n % a != 0) {  
                a++;  
            } else {  
                n /= a;  
                System.out.println(a); 
            }
        }
    }
}
