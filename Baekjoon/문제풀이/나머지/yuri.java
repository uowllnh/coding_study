package Baekjoon.문제풀이.나머지;
import java.util.Scanner;

public class yuri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println(((A * B) % C));
        System.out.println(((A % C) * (B % C)) % C);
    }

}
