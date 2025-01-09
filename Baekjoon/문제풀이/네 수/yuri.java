package Baekjoon.문제풀이.네수;
import java.util.Scanner;

public class yuri {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();
        String C = scanner.nextLine();
        String D = scanner.nextLine();

        String a = A + B;
        String b = C + D;

        long result = Long.parseLong(a) + Long.parseLong(b);

        System.out.println(result);

        scanner.close();
    }
    
}
